package main.java.lesson4.inheritance;

public class TeamMemberMain {
    public static void main(String[] args) {
        TeamMember teamMember = new TeamMember();
        System.out.print("Team Member. ");
        teamMember.doWork();

        System.out.println("==========");
        Developer developer = new Developer();
        System.out.print("Developer. ");
        developer.doWork();

        System.out.println("=============");
        System.out.println("Team " + teamMember.y);
        System.out.println("Developer " + developer.y);

        System.out.println("===========");
        developer.doWorkLikeParent();

        System.out.println("===========");
        TeamMember teamMember1 = new Developer();
        teamMember1.doWork();
        ((Developer)teamMember1).doWorkLikeParent();

        System.out.println("===========");
        QA qa = new QA();
        Developer dev = new Developer();
        TeamMember[] team = new TeamMember[2];
        team[0] = qa;
        team[1] = dev;
        for (TeamMember member: team){
            member.doWork();
        }
    }
}
