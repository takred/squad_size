package takred;

import java.util.ArrayList;
import java.util.List;

public class GraduationTitleSquadSize {
    private final List<AbundanceConfiguration> abundanceConfigurations;

    public GraduationTitleSquadSize(List<AbundanceConfiguration> abundanceConfigurations) {
        this.abundanceConfigurations = abundanceConfigurations;
    }

    public GraduationTitleSquadSize() {
        abundanceConfigurations = new ArrayList<>();
        abundanceConfigurations.add(new AbundanceConfiguration("Свора", 100));
        abundanceConfigurations.add(new AbundanceConfiguration("Нормально", 30));
        abundanceConfigurations.add(new AbundanceConfiguration("Мало", 10));
        abundanceConfigurations.add(new AbundanceConfiguration("Толпа", 50));
        abundanceConfigurations.add(new AbundanceConfiguration("Легион", 2000));
        abundanceConfigurations.add(new AbundanceConfiguration("Орда", 500));
    }

    public List<AbundanceConfiguration> getAbundanceConfigurations() {
        return abundanceConfigurations;
    }

    public void sort() {
        boolean indicator = true;
        while (indicator) {
            indicator = false;
            for (int i = 0; i < this.abundanceConfigurations.size() - 1; i++) {
                AbundanceConfiguration currentElement = this.abundanceConfigurations.get(i);
                AbundanceConfiguration nextElement = this.abundanceConfigurations.get(i + 1);
                if (currentElement.getSquadSize() > nextElement.getSquadSize()) {
                    AbundanceConfiguration element = new AbundanceConfiguration(currentElement);
                    this.abundanceConfigurations.set(i, nextElement);
                    this.abundanceConfigurations.set(i + 1, element);
                    indicator = true;
                }
            }
        }
    }
}
