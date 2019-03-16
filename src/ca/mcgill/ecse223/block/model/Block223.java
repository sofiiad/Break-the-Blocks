/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.io.Serializable;
import java.util.*;

// line 9 "../../../../../Block223Persistence.ump"
// line 7 "../../../../../Block223.ump"
public class Block223 implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Block223 Associations
  private List<User> users;
  private List<UserRole> roles;
  private List<Game> games;
  private List<GameSession> gameSessions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Block223()
  {
    users = new ArrayList<User>();
    roles = new ArrayList<UserRole>();
    games = new ArrayList<Game>();
    gameSessions = new ArrayList<GameSession>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public User getUser(int index)
  {
    User aUser = users.get(index);
    return aUser;
  }

  public List<User> getUsers()
  {
    List<User> newUsers = Collections.unmodifiableList(users);
    return newUsers;
  }

  public int numberOfUsers()
  {
    int number = users.size();
    return number;
  }

  public boolean hasUsers()
  {
    boolean has = users.size() > 0;
    return has;
  }

  public int indexOfUser(User aUser)
  {
    int index = users.indexOf(aUser);
    return index;
  }
  /* Code from template association_GetMany */
  public UserRole getRole(int index)
  {
    UserRole aRole = roles.get(index);
    return aRole;
  }

  public List<UserRole> getRoles()
  {
    List<UserRole> newRoles = Collections.unmodifiableList(roles);
    return newRoles;
  }

  public int numberOfRoles()
  {
    int number = roles.size();
    return number;
  }

  public boolean hasRoles()
  {
    boolean has = roles.size() > 0;
    return has;
  }

  public int indexOfRole(UserRole aRole)
  {
    int index = roles.indexOf(aRole);
    return index;
  }
  /* Code from template association_GetMany */
  public Game getGame(int index)
  {
    Game aGame = games.get(index);
    return aGame;
  }

  public List<Game> getGames()
  {
    List<Game> newGames = Collections.unmodifiableList(games);
    return newGames;
  }

  public int numberOfGames()
  {
    int number = games.size();
    return number;
  }

  public boolean hasGames()
  {
    boolean has = games.size() > 0;
    return has;
  }

  public int indexOfGame(Game aGame)
  {
    int index = games.indexOf(aGame);
    return index;
  }
  /* Code from template association_GetMany */
  public GameSession getGameSession(int index)
  {
    GameSession aGameSession = gameSessions.get(index);
    return aGameSession;
  }

  public List<GameSession> getGameSessions()
  {
    List<GameSession> newGameSessions = Collections.unmodifiableList(gameSessions);
    return newGameSessions;
  }

  public int numberOfGameSessions()
  {
    int number = gameSessions.size();
    return number;
  }

  public boolean hasGameSessions()
  {
    boolean has = gameSessions.size() > 0;
    return has;
  }

  public int indexOfGameSession(GameSession aGameSession)
  {
    int index = gameSessions.indexOf(aGameSession);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUsers()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public User addUser(String aUsername, UserRole... allRoles)
  {
    return new User(aUsername, this, allRoles);
  }

  public boolean addUser(User aUser)
  {
    boolean wasAdded = false;
    if (users.contains(aUser)) { return false; }
    Block223 existingBlock223 = aUser.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aUser.setBlock223(this);
    }
    else
    {
      users.add(aUser);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUser(User aUser)
  {
    boolean wasRemoved = false;
    //Unable to remove aUser, as it must always have a block223
    if (!this.equals(aUser.getBlock223()))
    {
      users.remove(aUser);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUserAt(User aUser, int index)
  {  
    boolean wasAdded = false;
    if(addUser(aUser))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUsers()) { index = numberOfUsers() - 1; }
      users.remove(aUser);
      users.add(index, aUser);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUserAt(User aUser, int index)
  {
    boolean wasAdded = false;
    if(users.contains(aUser))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUsers()) { index = numberOfUsers() - 1; }
      users.remove(aUser);
      users.add(index, aUser);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUserAt(aUser, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRoles()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */


  public boolean addRole(UserRole aRole)
  {
    boolean wasAdded = false;
    if (roles.contains(aRole)) { return false; }
    Block223 existingBlock223 = aRole.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aRole.setBlock223(this);
    }
    else
    {
      roles.add(aRole);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeRole(UserRole aRole)
  {
    boolean wasRemoved = false;
    //Unable to remove aRole, as it must always have a block223
    if (!this.equals(aRole.getBlock223()))
    {
      roles.remove(aRole);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRoleAt(UserRole aRole, int index)
  {  
    boolean wasAdded = false;
    if(addRole(aRole))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRoles()) { index = numberOfRoles() - 1; }
      roles.remove(aRole);
      roles.add(index, aRole);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRoleAt(UserRole aRole, int index)
  {
    boolean wasAdded = false;
    if(roles.contains(aRole))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRoles()) { index = numberOfRoles() - 1; }
      roles.remove(aRole);
      roles.add(index, aRole);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRoleAt(aRole, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGames()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Game addGame(String aName, int aNrBlocksPerLevel, Admin aAdmin, Ball aBall, Paddle aPaddle)
  {
    return new Game(aName, aNrBlocksPerLevel, aAdmin, aBall, aPaddle, this);
  }

  public boolean addGame(Game aGame)
  {
    boolean wasAdded = false;
    if (games.contains(aGame)) { return false; }
    Block223 existingBlock223 = aGame.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aGame.setBlock223(this);
    }
    else
    {
      games.add(aGame);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeGame(Game aGame)
  {
    boolean wasRemoved = false;
    //Unable to remove aGame, as it must always have a block223
    if (!this.equals(aGame.getBlock223()))
    {
      games.remove(aGame);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGameAt(Game aGame, int index)
  {  
    boolean wasAdded = false;
    if(addGame(aGame))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGames()) { index = numberOfGames() - 1; }
      games.remove(aGame);
      games.add(index, aGame);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGameAt(Game aGame, int index)
  {
    boolean wasAdded = false;
    if(games.contains(aGame))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGames()) { index = numberOfGames() - 1; }
      games.remove(aGame);
      games.add(index, aGame);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGameAt(aGame, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGameSessions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public GameSession addGameSession(boolean aOfTestMode, Game aGame, User aUser, SpecificBall aSpecificBall, SpecificPaddle aSpecificPaddle)
  {
    return new GameSession(aOfTestMode, aGame, aUser, this, aSpecificBall, aSpecificPaddle);
  }

  public boolean addGameSession(GameSession aGameSession)
  {
    boolean wasAdded = false;
    if (gameSessions.contains(aGameSession)) { return false; }
    Block223 existingBlock223 = aGameSession.getBlock223();
    boolean isNewBlock223 = existingBlock223 != null && !this.equals(existingBlock223);
    if (isNewBlock223)
    {
      aGameSession.setBlock223(this);
    }
    else
    {
      gameSessions.add(aGameSession);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeGameSession(GameSession aGameSession)
  {
    boolean wasRemoved = false;
    //Unable to remove aGameSession, as it must always have a block223
    if (!this.equals(aGameSession.getBlock223()))
    {
      gameSessions.remove(aGameSession);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGameSessionAt(GameSession aGameSession, int index)
  {  
    boolean wasAdded = false;
    if(addGameSession(aGameSession))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGameSessions()) { index = numberOfGameSessions() - 1; }
      gameSessions.remove(aGameSession);
      gameSessions.add(index, aGameSession);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGameSessionAt(GameSession aGameSession, int index)
  {
    boolean wasAdded = false;
    if(gameSessions.contains(aGameSession))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGameSessions()) { index = numberOfGameSessions() - 1; }
      gameSessions.remove(aGameSession);
      gameSessions.add(index, aGameSession);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGameSessionAt(aGameSession, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (users.size() > 0)
    {
      User aUser = users.get(users.size() - 1);
      aUser.delete();
      users.remove(aUser);
    }
    
    while (roles.size() > 0)
    {
      UserRole aRole = roles.get(roles.size() - 1);
      aRole.delete();
      roles.remove(aRole);
    }
    
    while (games.size() > 0)
    {
      Game aGame = games.get(games.size() - 1);
      aGame.delete();
      games.remove(aGame);
    }
    
    for(int i=gameSessions.size(); i > 0; i--)
    {
      GameSession aGameSession = gameSessions.get(i - 1);
      aGameSession.delete();
    }
  }

  // line 14 "../../../../../Block223Persistence.ump"
   public void reinitialize(){
    Game.reinitializeUniqueName(this.getGames());
		User.reinitializeUniqueUsername(this.getUsers());
		List<Block> blocks = new ArrayList<Block>();
		for (Game game : this.getGames()) {
		   blocks.addAll(game.getBlocks());
		}
		Block.reinitializeAutouniqueID(blocks);
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 12 "../../../../../Block223Persistence.ump"
  private static final long serialVersionUID = 2L ;

  
}