package io.pivotal.pal.flyway;

import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty("migrate-stage")
public class StageFlywayMigrationStrategy implements FlywayMigrationStrategy {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void migrate(Flyway flyway) {
        logger.info("Migration staged");
    }
}