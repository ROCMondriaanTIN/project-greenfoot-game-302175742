    
            
            
            /**
             *
             * @author R. Springer
             */
            public class TileFactory {
            
                /**
             * Creates a Tile object based on the mapIcon number you give
             *
             * @param mapIcon number
             * @return Tile tile object
             */
            public static Tile createTile(int mapIcon) {
                Tile tile;
                switch (mapIcon) {
                    case 150:
                        tile = new Tile("sandLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;
                    case 151:
                        tile = new Tile("sandMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;
                    case 62:
                        tile = new Tile("door_closedMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = false;
                        break;       
                    case 63:
                        tile = new Tile("door_closedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = false;
                        break;
                    case 134:
                        tile = new Tile("sandCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = false;
                        break;
                    case 156:
                        tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = false;
                        break;
                    case 132:
                        tile = new Tile("ropeVertical.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = false;
                        break;
                    case 135:
                        tile = new Tile("sandCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;
                    case 99:
                        tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = false;
                        break;                    
                    case 97:
                        tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;
                    case 95:
                        tile = new Tile("liquidLavaTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;
                    case 94:
                        tile = new Tile("liquidLava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;
                    case 145:
                        tile = new Tile("sandHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;                                        
                    case 147:
                        tile = new Tile("sandHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;  
                    case 152:
                        tile = new Tile("sandRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;  
                    case 136:
                        tile = new Tile("sandCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;  
                    case 138:
                        tile = new Tile("sandCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;  
                    case 14:
                        tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;  
                    case 197:
                        tile = new Tile("tochLit2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = false;
                        break;  
                    case 100:
                        tile = new Tile("lock_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;  
                    case 102:
                        tile = new Tile("lock_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;  
                    case 20:
                        tile = new Tile("bridge.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = false;
                        break;  
	                case 155:
                        tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = false;
                        break;  					
                    case 64:
                        tile = new LavaTile("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        break;                                                   
                    case 126:
                        tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;            
					case 16:
                        tile = new Tile("boxItemAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break; 
					case 144:
                        tile = new Tile("sandHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;      			
					case 133:
                        tile = new Tile("sand.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;    
					case 154:
                        tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;      
					case 65:
                        tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                        tile.isSolid = true;
                        break;        						
                    default:
						tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
						tile.isSolid = true;
                       break;
        }
        return tile;
    }
}
