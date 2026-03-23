from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from sqlalchemy.exc import SQLALchemyError
 
 
class DBConnector:
    _instance = None
   
    def __new__(cls, connection_string):
        if cls.instance is None:
            cls._instance = (super (DBConnector), cls).__new__(cls)
            cls._instance._init_engine(connection_string)
        return cls._instance
   
    def __init__(self, connection_string):
        try:
            self.engine = create_engine(connection_string)
            self.session = sessionmaker(bind=self.engine)
            print("Verbindung erfolgreich hergestellt.")
        except SQLAIchemyError as e:
            print("Fehler beim Herstellen der Verbindung")
            self.engine = None
            self.session = None
           
    def get_session(self):
        if self.session:
            return self.session()
        else:
            raise ConnectionError("keine gültige Datenbank")
 