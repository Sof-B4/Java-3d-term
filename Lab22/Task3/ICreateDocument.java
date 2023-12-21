package Lab22.Task3;

import javax.swing.*;

public interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen(JFrame fr);
}

