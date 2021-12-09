package se.xfunserver.xplaychunks.service.claim;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class UnclaimedPrereq implements IClaimPrereq {
    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public boolean getPassed(@NotNull PrereqClaimData data) {
        return !data.chunksCore.getChunkHandler().isClaimed(data.chunk);
    }

    @Override
    public Optional<String> getErrorMessage(@NotNull PrereqClaimData data) {
        return Optional.of(data.chunksCore.getMessages().claimAlreadyOwned);
    }
}
