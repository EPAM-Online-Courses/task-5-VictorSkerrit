package efs.task.collections.data;

import efs.task.collections.entity.Hero;
import efs.task.collections.entity.Town;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataProvider {

    public static final String DATA_SEPARATOR = ",";

    public List<Town> getTownsList() {

        int capacity = Data.baseTownsArray.length;
        List<Town> arrayTowns = new ArrayList<>(capacity);

        List<String> heroClasses = new ArrayList(2);
        for(String baseTown : Data.baseTownsArray){

            String [] data = baseTown.split(DATA_SEPARATOR);
            String townName = data[0].trim();
            heroClasses.add(data[1].trim());
            heroClasses.add(data[2].trim());

            Town t = new Town(townName, heroClasses);
            heroClasses.clear();
            arrayTowns.add(t);

        }
        return  arrayTowns;
    }

    public List<Town> getDLCTownsList() {
        int capacity = Data.dlcTownsArray.length;
        List<Town> dlcArrayTowns = new ArrayList<>(capacity);

        List<String> heroClasses = new ArrayList(1);
        for(String baseTown : Data.dlcTownsArray){

            var data = baseTown.split(DATA_SEPARATOR);
            String townName = data[0].trim();
            heroClasses.add(data[1].trim());

            Town t = new Town(townName, heroClasses);
            heroClasses.clear();
            dlcArrayTowns.add(t);

        }
        return  dlcArrayTowns;
    }


    public Set<Hero> getHeroesSet() {
        int capacity = Data.baseCharactersArray.length;
        Set<Hero> heroes = new HashSet<>(capacity);

        for (String baseCharacter : Data.baseCharactersArray) {
            String[] data = baseCharacter.split(DATA_SEPARATOR);
            String heroName = data[0].trim();
            String heroClass = data[1].trim();

            Hero hero = new Hero(heroName, heroClass);
            heroes.add(hero);
        }

        return heroes;
    }

    public Set<Hero> getDLCHeroesSet() {
        int capacity = Data.dlcCharactersArray.length;
        Set<Hero> dlcHeroes = new HashSet<>(capacity);

        for (String baseCharacter : Data.dlcCharactersArray) {
            String[] data = baseCharacter.split(DATA_SEPARATOR);
            String heroName = data[0].trim();
            String heroClass = data[1].trim();

            Hero hero = new Hero(heroName, heroClass);
            dlcHeroes.add(hero);
        }

        return dlcHeroes;
    }
}
