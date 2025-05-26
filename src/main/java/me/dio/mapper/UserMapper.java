package me.dio.mapper;

import me.dio.domain.model.*;
import me.dio.domain.model.dto.*;
import java.util.stream.Collectors;

public class UserMapper {
    public static UserDTO toDTO(User user) {
        if (user == null) return null;
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setAccount(toDTO(user.getAccount()));
        dto.setCard(toDTO(user.getCard()));
        if (user.getFeatures() != null)
            dto.setFeatures(user.getFeatures().stream().map(UserMapper::toDTO).collect(Collectors.toList()));
        if (user.getNews() != null)
            dto.setNews(user.getNews().stream().map(UserMapper::toDTO).collect(Collectors.toList()));
        return dto;
    }
    public static User toEntity(UserDTO dto) {
        if (dto == null) return null;
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setAccount(toEntity(dto.getAccount()));
        user.setCard(toEntity(dto.getCard()));
        if (dto.getFeatures() != null)
            user.setFeatures(dto.getFeatures().stream().map(UserMapper::toEntity).collect(Collectors.toList()));
        if (dto.getNews() != null)
            user.setNews(dto.getNews().stream().map(UserMapper::toEntity).collect(Collectors.toList()));
        return user;
    }
    public static AccountDTO toDTO(Account account) {
        if (account == null) return null;
        AccountDTO dto = new AccountDTO();
        dto.setNumber(account.getNumber());
        dto.setAgency(account.getAgency());
        dto.setBalance(account.getBalance());
        dto.setLimit(account.getLimit());
        return dto;
    }
    public static Account toEntity(AccountDTO dto) {
        if (dto == null) return null;
        Account account = new Account();
        account.setNumber(dto.getNumber());
        account.setAgency(dto.getAgency());
        account.setBalance(dto.getBalance());
        account.setLimit(dto.getLimit());
        return account;
    }
    public static CardDTO toDTO(Card card) {
        if (card == null) return null;
        CardDTO dto = new CardDTO();
        dto.setNumber(card.getNumber());
        dto.setLimit(card.getLimit());
        return dto;
    }
    public static Card toEntity(CardDTO dto) {
        if (dto == null) return null;
        Card card = new Card();
        card.setNumber(dto.getNumber());
        card.setLimit(dto.getLimit());
        return card;
    }
    public static FeatureDTO toDTO(Feature feature) {
        if (feature == null) return null;
        FeatureDTO dto = new FeatureDTO();
        dto.setIcon(feature.getIcon());
        dto.setDescription(feature.getDescription());
        return dto;
    }
    public static Feature toEntity(FeatureDTO dto) {
        if (dto == null) return null;
        Feature feature = new Feature();
        feature.setIcon(dto.getIcon());
        feature.setDescription(dto.getDescription());
        return feature;
    }
    public static NewsDTO toDTO(News news) {
        if (news == null) return null;
        NewsDTO dto = new NewsDTO();
        dto.setIcon(news.getIcon());
        dto.setDescription(news.getDescription());
        return dto;
    }
    public static News toEntity(NewsDTO dto) {
        if (dto == null) return null;
        News news = new News();
        news.setIcon(dto.getIcon());
        news.setDescription(dto.getDescription());
        return news;
    }
} 