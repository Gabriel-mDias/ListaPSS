
package br.ufes.chat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class SalaChat implements MediadorChat{

    private List<Participante> participants;

    public SalaChat() {
        participants = new ArrayList<>();
    }
    
    
    @Override
    public void enviar(String mensagem, Participante participante) {
        participants.forEach(p -> {
            if(!p.equals(participante)) {
                p.receber(mensagem, participante);
            }        
        });
    }

    @Override
    public Participante criarParticipante(String name, MediadorChat mediador) {
        Participante p = new ParticipanteChat(mediador, name);
        this.participants.add(p);
        return p;
    }
    
}
