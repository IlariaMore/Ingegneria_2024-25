public class Curator {
    
    private RequestHandler requestHandler;

    public Curator(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void check(Visitable curated) {
        curated.accept(new OpenVisitor());
        if (isGood) {
            curated.accept(new AcceptVisitor());
        } else {
            curated.accept(new DenyVisitor());
        }
    }
}
