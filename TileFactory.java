
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
    public Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
                tile = new Tile("blockerBody.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 1:
                tile = new Tile("blockerMad.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 2:
                tile = new Tile("blockerSad.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 3:
                tile = new Tile("bomb.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 4:
                tile = new Tile("bombFlash.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 5:
                tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 6:
                tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 7:
                tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 8:
                tile = new Tile("boxCoin_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 9:
                tile = new Tile("boxCoinAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 10:
                tile = new Tile("boxCoinAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 11:
                tile = new Tile("boxEmpty.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 12:
                tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 13:
                tile = new Tile("boxExplosive_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 14:
                tile = new Tile("boxExplosiveAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 15:
                tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 16:
                tile = new Tile("boxItem_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break; 
            case 17:
                tile = new Tile("boxItemAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 18:
                tile = new Tile("boxItemAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 19:
                tile = new Tile("boxWarning.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break; 
            case 20:
                tile = new Tile("brickWall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break; 
            case 21:
                tile = new Tile("bridge.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;    
            case 22:
                tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.getImage().mirrorVertically();
                tile.isSolid = true;
                break;
            case 23:
                tile = new Tile("bush.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;    
            case 24:
                tile = new Tile("buttonBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 25:
                tile = new Tile("buttonBlue_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 26 :
                tile = new Tile("buttonGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 27:
                tile = new Tile("buttonGreen_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 28 :
                tile = new Tile("buttonRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;  
            case 29:
                tile = new Tile("buttonRed_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 30:
                tile = new Tile("buttonYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 31:
                tile = new Tile("buttonYellow_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 32:
                tile = new Tile("cactus.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 33:
                tile = new Tile("castle.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 34:
                tile = new Tile("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 35:
                tile = new Tile("castleCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 36:
                tile = new Tile("castleCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 37:
                tile = new Tile("castleCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 38:
                tile = new Tile("castleCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 39:
                tile = new Tile("castleCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 40:
                tile = new Tile("casteHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                        case 80:
                tile = new Door("door_closedMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
             case 81:
                tile = new DoorTop("door_closedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 109:
                tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 67:
                tile = new Tile("grassCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 112: 
                tile = new Tile("grassCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 132:
                tile = new Tile("hill_large.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 128 : 
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 114:
                tile = new Tile("grassCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
             case 169:
                tile = new Keys("keyBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 173 :
                tile = new Ladder("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 178 :
                tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 179 : 
                 tile = new Death("liquidWaterTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = false;
                 break;
            case 224:
                 tile = new Tile("ropeAttached.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = false;
                break;
            case 226:
                 tile = new Tile("ropeVertical.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = false;
                break;
                case 282: 
                tile = new Tile("star.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 105: 
                tile = new Tile("gemBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 250: 
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 129:
                 tile = new Tile("grassMid_notSolid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                 break;
            case 103 :
                 tile = new Tile("flyFly1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
             case 127 :
                 tile = new Tile("grassLeft_notSolid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = false;
                break;
                case 279 :
                 tile = new Death("spikes.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 311:
                tile = new Door("door_closedMid2 2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 312:
                tile = new Door("door_closedMid3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 313:
                tile = new Door("door_closedMid4.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 314:
                tile = new Door("door_closedMid5.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 315:
                tile = new Door("door_closedMid6.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 316:
                tile = new Door("door_closedMid7.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 317:
                tile = new Door("door_closedMid8.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 318:
                tile = new Door("door_closedMid9.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 319:
                tile = new Door("door_closedMid10.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 320:
                tile = new Door("door_closedMid12.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 321:
                tile = new Door("door_closedMid13.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 62:
                tile = new Tile("dirtCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 54: 
                tile = new Tile("cloud1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 55: 
                tile = new Tile("cloud2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                case 56: 
                tile = new Tile("cloud3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
                            
                    
            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
