package fly2sky;

import java.util.List;

public class IoController {

    public static void listIndirectRoutes(List<List<Route>> indirectRoutes) {

        for(int i = 0; i < indirectRoutes.size(); i++) {
            System.out.println(indirectRoutes.get(i).get(0).originAirport().identifier() + " --> "
                    + indirectRoutes.get(i).get(0).destinationAirport().identifier() + " --> "
                    + indirectRoutes.get(i).get(1).destinationAirport().identifier());
        }
    }
}
