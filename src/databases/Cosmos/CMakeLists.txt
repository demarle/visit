# DO NOT EDIT THIS FILE! THIS FILE IS AUTOMATICALLY GENERATED BY xml2cmake
PROJECT(Cosmos_database)

INCLUDE(${VISIT_SOURCE_DIR}/CMake/PluginMacros.cmake)

ADD_DATABASE_CODE_GEN_TARGETS(Cosmos)

SET(COMMON_SOURCES
CosmosPluginInfo.C
CosmosCommonPluginInfo.C
)

SET(LIBI_SOURCES
CosmosPluginInfo.C
)

SET(LIBM_SOURCES
CosmosMDServerPluginInfo.C
${COMMON_SOURCES}
avtCosmosFileFormat.C
)

SET(LIBE_SOURCES
CosmosEnginePluginInfo.C
${COMMON_SOURCES}
avtCosmosFileFormat.C
)

INCLUDE_DIRECTORIES(
${CMAKE_CURRENT_SOURCE_DIR}
${HDF4_INCLUDE_DIR}
${VISIT_DATABASE_INCLUDES}
)

if(WIN32)
    add_compile_definitions(${HDF4_WIN32_DEFINES})
endif()

LINK_DIRECTORIES(${VISIT_LIBRARY_DIR} ${HDF4_LIBRARY_DIR} )

ADD_LIBRARY(ICosmosDatabase ${LIBI_SOURCES})
TARGET_LINK_LIBRARIES(ICosmosDatabase visitcommon)
SET(INSTALLTARGETS ICosmosDatabase)

IF(NOT VISIT_ENGINE_ONLY AND NOT VISIT_DBIO_ONLY)
    ADD_LIBRARY(MCosmosDatabase ${LIBM_SOURCES})
    TARGET_LINK_LIBRARIES(MCosmosDatabase visitcommon avtdbatts avtdatabase_ser ${HDF4_LIB} )
    ADD_TARGET_DEFINITIONS(MCosmosDatabase MDSERVER)
    SET(INSTALLTARGETS ${INSTALLTARGETS} MCosmosDatabase)
ENDIF(NOT VISIT_ENGINE_ONLY AND NOT VISIT_DBIO_ONLY)

ADD_LIBRARY(ECosmosDatabase_ser ${LIBE_SOURCES})
TARGET_LINK_LIBRARIES(ECosmosDatabase_ser visitcommon avtpipeline_ser avtdatabase_ser ${HDF4_LIB} )
ADD_TARGET_DEFINITIONS(ECosmosDatabase_ser ENGINE)
SET(INSTALLTARGETS ${INSTALLTARGETS} ECosmosDatabase_ser)

IF(VISIT_PARALLEL)
    ADD_PARALLEL_LIBRARY(ECosmosDatabase_par ${LIBE_SOURCES})
    TARGET_LINK_LIBRARIES(ECosmosDatabase_par visitcommon avtpipeline_par avtdatabase_par ${HDF4_LIB} )
    ADD_TARGET_DEFINITIONS(ECosmosDatabase_par ENGINE)
    SET(INSTALLTARGETS ${INSTALLTARGETS} ECosmosDatabase_par)
ENDIF(VISIT_PARALLEL)

VISIT_INSTALL_DATABASE_PLUGINS(${INSTALLTARGETS})
VISIT_PLUGIN_TARGET_RTOD(databases ${INSTALLTARGETS})
VISIT_PLUGIN_TARGET_FOLDER(databases Cosmos ${INSTALLTARGETS})

