package io.blackroad;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class StatusAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showInfoMessage("BlackRoad OS: Online | 30K Agents Ready", "Status");
    }
}
