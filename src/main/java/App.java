import CRUDService.ClientCrudService;
import CRUDService.PlanetCrudService;

public class App {
    public static void main(String[] args) {
        ClientCrudService clientCrudService = new ClientCrudService();
        PlanetCrudService planetCrudService = new PlanetCrudService();
        clientCrudService.createClient("Anatoliy Permission");
        clientCrudService.getClientAll();
        clientCrudService.deleteClientById(11);
        System.out.println(clientCrudService.getClientById(3));
        clientCrudService.UpdateById(3, "New Name");
        clientCrudService.getClientAll();
        planetCrudService.createPlanet("PMO46", "UKROPIAY");
        planetCrudService.getPlanetAll();
        planetCrudService.UpdatePlanetById("PMO46", "UKRAINE");
        planetCrudService.getPlanetAll();
        System.out.println(planetCrudService.getPlanetById("PMO46"));
        planetCrudService.deletePlanetById("PMO46");
        planetCrudService.getPlanetAll();
    }
}
