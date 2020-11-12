package org.ccsunnyfd.design;

import org.ccsunnyfd.design.originator.InputText;
import org.ccsunnyfd.design.snapshot.Snapshot;
import org.ccsunnyfd.design.snapshotHolder.SnapshotHolder;

import java.util.Scanner;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String input = scanner.next();
            if(input.equals(":list")) {
                System.out.println(inputText.getText());
            } else if(input.equals(":undo")) {
                Snapshot snapshot = snapshotHolder.popSnapshot();
                inputText.restoreSnapshot(snapshot);
            } else {
                snapshotHolder.pushSnapshot(inputText.createSnapshot());
                inputText.append(input);
            }
        }
    }
}
