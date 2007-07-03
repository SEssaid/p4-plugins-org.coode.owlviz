package uk.ac.man.cs.mig.coode.owlviz.command;

import uk.ac.man.cs.mig.coode.owlviz.ui.OWLVizIcons;
import uk.ac.man.cs.mig.coode.owlviz.ui.OWLVizView;
import uk.ac.man.cs.mig.util.graph.ui.GraphComponent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Iterator;

import org.protege.editor.owl.ui.view.OWLSelectionViewAction;

/**
 * User: matthewhorridge<br>
 * The Univeristy Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: Feb 11, 2004<br><br>
 * <p/>
 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br><br>
 */
public class HideAllClassesCommand extends OWLSelectionViewAction {

    private OWLVizView view;

    public HideAllClassesCommand(OWLVizView view) {
        super("Hide all classes", OWLVizIcons.getIcon(OWLVizIcons.HIDE_ALL_CLASSES_ICON));
        this.view = view;
    }

    public void updateState() {
        setEnabled(true);
    }

    public void dispose() {
    }


    /**
     * Invoked when an action occurs.
     */
    public void actionPerformed(ActionEvent e) {
        for(Iterator it = view.getGraphComponents().iterator(); it.hasNext(); ) {
            GraphComponent graphComponent = (GraphComponent) it.next();
            graphComponent.getVisualisedObjectManager().hideAll();
        }
    }
}
