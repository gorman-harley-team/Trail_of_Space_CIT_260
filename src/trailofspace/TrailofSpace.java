/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofspace;


import byui.cit260.curiousWorkmanship.model.Player;
import byui.cit260.curiousWorkmanship.model.ship;
import byui.cit260.curiousWorkmanship.model.characters;
import byui.cit260.curiousWorkmanship.model.spaceCaves;
import byui.cit260.curiousWorkmanship.model.map;
import byui.cit260.curiousWorkmanship.model.game;
import byui.cit260.curiousWorkmanship.model.armor;
import byui.cit260.curiousWorkmanship.model.ancientAlienBattle;
import byui.cit260.curiousWorkmanship.model.weapon;
import byui.cit260.curiousWorkmanship.model.location;
import byui.cit260.curiousWorkmanship.model.inventory;
import byui.cit260.curiousWorkmanship.model.battle;


/**
 *
 * @author Travis
 * 
 * private double armor;
    private double upgradeArmor;
 */
public class TrailofSpace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Travis Harley");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    
        ship shipOne = new ship();
        
        shipOne.setExit("No");
        shipOne.setReEnter("No");
        shipOne.setUpgrade("Upgrade Engine");
        shipOne.setShipStats("No errors. Running good!");
        
        String shipInfo = shipOne.toString();
        System.out.println(shipInfo);

        characters charactersOne = new characters();
        
        charactersOne.setCharacterName("Bob Jones");
        charactersOne.setDescription("Werid dude with multiple personalities");
        charactersOne.setCoordinates("Moon");
        
        String charactersInfo = charactersOne.toString();
        System.out.println(charactersInfo);
        
        spaceCaves spaceCavesOne = new spaceCaves();
        
        spaceCavesOne.setCaveTrapOne("What is your favorite color?");
        spaceCavesOne.setCaveTrapTwo("What is the capitol of Nevada?");
        spaceCavesOne.setCaveCollection("Space Rock!");
        
        String spaceCavesInfo = spaceCavesOne.toString();
        System.out.println(spaceCavesInfo);
        
        map mapOne = new map();
        
        mapOne.setRowCount("1");
        mapOne.setColumnCount("5");
        mapOne.setLocationsVisited("Sector 6");
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
                
        game gameOne = new game();
        
        gameOne.setCharacterName("Captain Force");
        gameOne.setWeapons("Plasma Ray Gun");
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        armor armorOne = new armor();
        
        armorOne.setArmor(5);
        armorOne.setUpgradeArmor(10);
        
        String armorInfo = armorOne.toString();
        System.out.println(armorInfo);        
        
        ancientAlienBattle ancientAlienBattleOne = new ancientAlienBattle();
        
        ancientAlienBattleOne.setMathTrapOne(10);
        ancientAlienBattleOne.setMathTrapTwo(15);
        ancientAlienBattleOne.setMathTrapThree(20);
        
        String ancientAlienBattleInfo = ancientAlienBattleOne.toString();
        System.out.println(ancientAlienBattleInfo);   
        
        weapon weaponOne = new weapon();
        
        weaponOne.setPlasmaGun("Plasma Ray");
        weaponOne.setBeamBlade("Green Beam Blade");
        
        String weaponInfo = weaponOne.toString();
        System.out.println(weaponInfo);
        
        location locationOne = new location();
        
        locationOne.setRow(1);
        locationOne.setColumn(4);
        locationOne.setVisited("No");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        inventory inventoryOne = new inventory();
        
        inventoryOne.setItem("Bullets");
        inventoryOne.setUpgradeShip("Space Gasoline");
        inventoryOne.setUpgradeWeapon("Laser Beam");
        inventoryOne.setUpgradeArmor("Shield");
        inventoryOne.setHealth(10);
        
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
        battle battleOne = new battle();
        
        battleOne.setAttack(10);
        battleOne.setDefend(3);
        
        String battleInfo = battleOne.toString();
        System.out.println(battleInfo);
                
    }
    
}
