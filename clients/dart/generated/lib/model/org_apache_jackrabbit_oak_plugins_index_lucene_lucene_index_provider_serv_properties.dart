//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties {
  /// Returns a new [OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties] instance.
  OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties({
    this.disabled,
    this.debug,
    this.localIndexDir,
    this.enableOpenIndexAsync,
    this.threadPoolSize,
    this.prefetchIndexFiles,
    this.extractedTextCacheSizeInMB,
    this.extractedTextCacheExpiryInSecs,
    this.alwaysUsePreExtractedCache,
    this.booleanClauseLimit,
    this.enableHybridIndexing,
    this.hybridQueueSize,
    this.disableStoredIndexDefinition,
    this.deletedBlobsCollectionEnabled,
    this.propIndexCleanerIntervalInSecs,
    this.enableSingleBlobIndexFiles,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? disabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? debug;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? localIndexDir;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enableOpenIndexAsync;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? threadPoolSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? prefetchIndexFiles;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? extractedTextCacheSizeInMB;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? extractedTextCacheExpiryInSecs;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? alwaysUsePreExtractedCache;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? booleanClauseLimit;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enableHybridIndexing;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? hybridQueueSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? disableStoredIndexDefinition;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? deletedBlobsCollectionEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? propIndexCleanerIntervalInSecs;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enableSingleBlobIndexFiles;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties &&
    other.disabled == disabled &&
    other.debug == debug &&
    other.localIndexDir == localIndexDir &&
    other.enableOpenIndexAsync == enableOpenIndexAsync &&
    other.threadPoolSize == threadPoolSize &&
    other.prefetchIndexFiles == prefetchIndexFiles &&
    other.extractedTextCacheSizeInMB == extractedTextCacheSizeInMB &&
    other.extractedTextCacheExpiryInSecs == extractedTextCacheExpiryInSecs &&
    other.alwaysUsePreExtractedCache == alwaysUsePreExtractedCache &&
    other.booleanClauseLimit == booleanClauseLimit &&
    other.enableHybridIndexing == enableHybridIndexing &&
    other.hybridQueueSize == hybridQueueSize &&
    other.disableStoredIndexDefinition == disableStoredIndexDefinition &&
    other.deletedBlobsCollectionEnabled == deletedBlobsCollectionEnabled &&
    other.propIndexCleanerIntervalInSecs == propIndexCleanerIntervalInSecs &&
    other.enableSingleBlobIndexFiles == enableSingleBlobIndexFiles;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (disabled == null ? 0 : disabled!.hashCode) +
    (debug == null ? 0 : debug!.hashCode) +
    (localIndexDir == null ? 0 : localIndexDir!.hashCode) +
    (enableOpenIndexAsync == null ? 0 : enableOpenIndexAsync!.hashCode) +
    (threadPoolSize == null ? 0 : threadPoolSize!.hashCode) +
    (prefetchIndexFiles == null ? 0 : prefetchIndexFiles!.hashCode) +
    (extractedTextCacheSizeInMB == null ? 0 : extractedTextCacheSizeInMB!.hashCode) +
    (extractedTextCacheExpiryInSecs == null ? 0 : extractedTextCacheExpiryInSecs!.hashCode) +
    (alwaysUsePreExtractedCache == null ? 0 : alwaysUsePreExtractedCache!.hashCode) +
    (booleanClauseLimit == null ? 0 : booleanClauseLimit!.hashCode) +
    (enableHybridIndexing == null ? 0 : enableHybridIndexing!.hashCode) +
    (hybridQueueSize == null ? 0 : hybridQueueSize!.hashCode) +
    (disableStoredIndexDefinition == null ? 0 : disableStoredIndexDefinition!.hashCode) +
    (deletedBlobsCollectionEnabled == null ? 0 : deletedBlobsCollectionEnabled!.hashCode) +
    (propIndexCleanerIntervalInSecs == null ? 0 : propIndexCleanerIntervalInSecs!.hashCode) +
    (enableSingleBlobIndexFiles == null ? 0 : enableSingleBlobIndexFiles!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties[disabled=$disabled, debug=$debug, localIndexDir=$localIndexDir, enableOpenIndexAsync=$enableOpenIndexAsync, threadPoolSize=$threadPoolSize, prefetchIndexFiles=$prefetchIndexFiles, extractedTextCacheSizeInMB=$extractedTextCacheSizeInMB, extractedTextCacheExpiryInSecs=$extractedTextCacheExpiryInSecs, alwaysUsePreExtractedCache=$alwaysUsePreExtractedCache, booleanClauseLimit=$booleanClauseLimit, enableHybridIndexing=$enableHybridIndexing, hybridQueueSize=$hybridQueueSize, disableStoredIndexDefinition=$disableStoredIndexDefinition, deletedBlobsCollectionEnabled=$deletedBlobsCollectionEnabled, propIndexCleanerIntervalInSecs=$propIndexCleanerIntervalInSecs, enableSingleBlobIndexFiles=$enableSingleBlobIndexFiles]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.disabled != null) {
      json[r'disabled'] = this.disabled;
    } else {
      json[r'disabled'] = null;
    }
    if (this.debug != null) {
      json[r'debug'] = this.debug;
    } else {
      json[r'debug'] = null;
    }
    if (this.localIndexDir != null) {
      json[r'localIndexDir'] = this.localIndexDir;
    } else {
      json[r'localIndexDir'] = null;
    }
    if (this.enableOpenIndexAsync != null) {
      json[r'enableOpenIndexAsync'] = this.enableOpenIndexAsync;
    } else {
      json[r'enableOpenIndexAsync'] = null;
    }
    if (this.threadPoolSize != null) {
      json[r'threadPoolSize'] = this.threadPoolSize;
    } else {
      json[r'threadPoolSize'] = null;
    }
    if (this.prefetchIndexFiles != null) {
      json[r'prefetchIndexFiles'] = this.prefetchIndexFiles;
    } else {
      json[r'prefetchIndexFiles'] = null;
    }
    if (this.extractedTextCacheSizeInMB != null) {
      json[r'extractedTextCacheSizeInMB'] = this.extractedTextCacheSizeInMB;
    } else {
      json[r'extractedTextCacheSizeInMB'] = null;
    }
    if (this.extractedTextCacheExpiryInSecs != null) {
      json[r'extractedTextCacheExpiryInSecs'] = this.extractedTextCacheExpiryInSecs;
    } else {
      json[r'extractedTextCacheExpiryInSecs'] = null;
    }
    if (this.alwaysUsePreExtractedCache != null) {
      json[r'alwaysUsePreExtractedCache'] = this.alwaysUsePreExtractedCache;
    } else {
      json[r'alwaysUsePreExtractedCache'] = null;
    }
    if (this.booleanClauseLimit != null) {
      json[r'booleanClauseLimit'] = this.booleanClauseLimit;
    } else {
      json[r'booleanClauseLimit'] = null;
    }
    if (this.enableHybridIndexing != null) {
      json[r'enableHybridIndexing'] = this.enableHybridIndexing;
    } else {
      json[r'enableHybridIndexing'] = null;
    }
    if (this.hybridQueueSize != null) {
      json[r'hybridQueueSize'] = this.hybridQueueSize;
    } else {
      json[r'hybridQueueSize'] = null;
    }
    if (this.disableStoredIndexDefinition != null) {
      json[r'disableStoredIndexDefinition'] = this.disableStoredIndexDefinition;
    } else {
      json[r'disableStoredIndexDefinition'] = null;
    }
    if (this.deletedBlobsCollectionEnabled != null) {
      json[r'deletedBlobsCollectionEnabled'] = this.deletedBlobsCollectionEnabled;
    } else {
      json[r'deletedBlobsCollectionEnabled'] = null;
    }
    if (this.propIndexCleanerIntervalInSecs != null) {
      json[r'propIndexCleanerIntervalInSecs'] = this.propIndexCleanerIntervalInSecs;
    } else {
      json[r'propIndexCleanerIntervalInSecs'] = null;
    }
    if (this.enableSingleBlobIndexFiles != null) {
      json[r'enableSingleBlobIndexFiles'] = this.enableSingleBlobIndexFiles;
    } else {
      json[r'enableSingleBlobIndexFiles'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(
        disabled: ConfigNodePropertyBoolean.fromJson(json[r'disabled']),
        debug: ConfigNodePropertyBoolean.fromJson(json[r'debug']),
        localIndexDir: ConfigNodePropertyString.fromJson(json[r'localIndexDir']),
        enableOpenIndexAsync: ConfigNodePropertyBoolean.fromJson(json[r'enableOpenIndexAsync']),
        threadPoolSize: ConfigNodePropertyInteger.fromJson(json[r'threadPoolSize']),
        prefetchIndexFiles: ConfigNodePropertyBoolean.fromJson(json[r'prefetchIndexFiles']),
        extractedTextCacheSizeInMB: ConfigNodePropertyInteger.fromJson(json[r'extractedTextCacheSizeInMB']),
        extractedTextCacheExpiryInSecs: ConfigNodePropertyInteger.fromJson(json[r'extractedTextCacheExpiryInSecs']),
        alwaysUsePreExtractedCache: ConfigNodePropertyBoolean.fromJson(json[r'alwaysUsePreExtractedCache']),
        booleanClauseLimit: ConfigNodePropertyInteger.fromJson(json[r'booleanClauseLimit']),
        enableHybridIndexing: ConfigNodePropertyBoolean.fromJson(json[r'enableHybridIndexing']),
        hybridQueueSize: ConfigNodePropertyInteger.fromJson(json[r'hybridQueueSize']),
        disableStoredIndexDefinition: ConfigNodePropertyBoolean.fromJson(json[r'disableStoredIndexDefinition']),
        deletedBlobsCollectionEnabled: ConfigNodePropertyBoolean.fromJson(json[r'deletedBlobsCollectionEnabled']),
        propIndexCleanerIntervalInSecs: ConfigNodePropertyInteger.fromJson(json[r'propIndexCleanerIntervalInSecs']),
        enableSingleBlobIndexFiles: ConfigNodePropertyBoolean.fromJson(json[r'enableSingleBlobIndexFiles']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

