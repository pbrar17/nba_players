package com.nba.player_playoff_stats_22_23.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="nba_player_stats_playoffs")
public class Player {
//    @Id
    @Column(name="Rk")
    private Long id;
    @Id
    @Column(name="Player", unique = true)
    private String name;
    @Column(name="Pos")
    private String pos;
    @Column(name="Age")
    private Integer age;
    @Column(name="Tm")
    private String team;
    @Column(name="G")
    private double gamesPlayed;
    @Column(name="GS")
    private double gamesStarted;
    @Column(name="MP")
    private double matchesPlayed;
    @Column(name="FG")
    private double fPM;
    @Column(name="FGA")
    private double fGA;
//    @Column(name="FG%")
    @Column(name = "fg_percentage")
    private double fgPct;
    @Column(name="three_points_at")
    private double threePtAttempted;
    @Column(name="three_points")
    private double threePtMade;
    @Column(name="three_point_percentage")
    private double threePtPct;
    @Column(name="two_points_at")
    private double twoPtAttempted;
    @Column(name="two_points")
    private double twoPtMade;
    @Column(name="two_point_percentage")
    private double twoPtPct;
    @Column(name="efg_percentage")
    private double effectiveFGPCT;
    @Column(name="FT")
    private double freeThrowsMade;
    @Column(name="FTA")
    private double freeThrowsAttempted;
    @Column(name="free_throw_percentage")
    private double freeThrowsPct;
    @Column(name="ORB")
    private double offensiveRebounds;
    @Column(name="DRB")
    private double defensiveRebounds;
    @Column(name="TRB")
    private double totalRebounds;
    @Column(name="AST")
    private double assists;
    @Column(name="STL")
    private double steals;
    @Column(name="BLK")
    private double blocks;
    @Column(name="TOV")
    private double turnovers;
    @Column(name="PF")
    private double personalFoulsPerGame;
    @Column(name="PTS")
    private double points;

    public Player() {
    }
    public Player(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public double getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(double gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public double getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(double gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public double getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(double matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public double getfPM() {
        return fPM;
    }

    public void setfPM(double fPM) {
        this.fPM = fPM;
    }

    public double getfGA() {
        return fGA;
    }

    public void setfGA(double fGA) {
        this.fGA = fGA;
    }

    public double getFgPct() {
        return fgPct;
    }

    public void setFgPct(double fgPct) {
        this.fgPct = fgPct;
    }

    public double getThreePtAttempted() {
        return threePtAttempted;
    }

    public void setThreePtAttempted(double threePtAttempted) {
        this.threePtAttempted = threePtAttempted;
    }

    public double getThreePtMade() {
        return threePtMade;
    }

    public void setThreePtMade(double threePtMade) {
        this.threePtMade = threePtMade;
    }

    public double getThreePtPct() {
        return threePtPct;
    }

    public void setThreePtPct(double threePtPct) {
        this.threePtPct = threePtPct;
    }

    public double getTwoPtAttempted() {
        return twoPtAttempted;
    }

    public void setTwoPtAttempted(double twoPtAttempted) {
        this.twoPtAttempted = twoPtAttempted;
    }

    public double getTwoPtMade() {
        return twoPtMade;
    }

    public void setTwoPtMade(double twoPtMade) {
        this.twoPtMade = twoPtMade;
    }

    public double getTwoPtPct() {
        return twoPtPct;
    }

    public void setTwoPtPct(double twoPtPct) {
        this.twoPtPct = twoPtPct;
    }

    public double getEffectiveFGPCT() {
        return effectiveFGPCT;
    }

    public void setEffectiveFGPCT(double effectiveFGPCT) {
        this.effectiveFGPCT = effectiveFGPCT;
    }

    public double getFreeThrowsMade() {
        return freeThrowsMade;
    }

    public void setFreeThrowsMade(double freeThrowsMade) {
        this.freeThrowsMade = freeThrowsMade;
    }

    public double getFreeThrowsAttempted() {
        return freeThrowsAttempted;
    }

    public void setFreeThrowsAttempted(double freeThrowsAttempted) {
        this.freeThrowsAttempted = freeThrowsAttempted;
    }

    public double getFreeThrowsPct() {
        return freeThrowsPct;
    }

    public void setFreeThrowsPct(double freeThrowsPct) {
        this.freeThrowsPct = freeThrowsPct;
    }

    public double getOffensiveRebounds() {
        return offensiveRebounds;
    }

    public void setOffensiveRebounds(double offensiveRebounds) {
        this.offensiveRebounds = offensiveRebounds;
    }

    public double getDefensiveRebounds() {
        return defensiveRebounds;
    }

    public void setDefensiveRebounds(double defensiveRebounds) {
        this.defensiveRebounds = defensiveRebounds;
    }

    public double getTotalRebounds() {
        return totalRebounds;
    }

    public void setTotalRebounds(double totalRebounds) {
        this.totalRebounds = totalRebounds;
    }

    public double getAssists() {
        return assists;
    }

    public void setAssists(double assists) {
        this.assists = assists;
    }

    public double getSteals() {
        return steals;
    }

    public void setSteals(double steals) {
        this.steals = steals;
    }

    public double getBlocks() {
        return blocks;
    }

    public void setBlocks(double blocks) {
        this.blocks = blocks;
    }

    public double getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(double turnovers) {
        this.turnovers = turnovers;
    }

    public double getPersonalFoulsPerGame() {
        return personalFoulsPerGame;
    }

    public void setPersonalFoulsPerGame(double personalFoulsPerGame) {
        this.personalFoulsPerGame = personalFoulsPerGame;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }
}
