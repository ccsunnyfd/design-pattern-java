package org.ccsunnyfd.design.snapshotHolder;

import org.ccsunnyfd.design.snapshot.Snapshot;

import java.util.Stack;

/**
 * SnapshotHolder
 *
 * @version 1.0
 */
public class SnapshotHolder {
    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
