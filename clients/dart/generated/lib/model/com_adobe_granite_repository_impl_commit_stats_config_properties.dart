//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {
  /// Returns a new [ComAdobeGraniteRepositoryImplCommitStatsConfigProperties] instance.
  ComAdobeGraniteRepositoryImplCommitStatsConfigProperties({
    this.enabled,
    this.intervalSeconds,
    this.commitsPerIntervalThreshold,
    this.maxLocationLength,
    this.maxDetailsShown,
    this.minDetailsPercentage,
    this.threadMatchers,
    this.maxGreedyDepth,
    this.greedyStackMatchers,
    this.stackFilters,
    this.stackMatchers,
    this.stackCategorizers,
    this.stackShorteners,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? intervalSeconds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? commitsPerIntervalThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxLocationLength;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxDetailsShown;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? minDetailsPercentage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? threadMatchers;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxGreedyDepth;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? greedyStackMatchers;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? stackFilters;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? stackMatchers;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? stackCategorizers;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? stackShorteners;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteRepositoryImplCommitStatsConfigProperties &&
    other.enabled == enabled &&
    other.intervalSeconds == intervalSeconds &&
    other.commitsPerIntervalThreshold == commitsPerIntervalThreshold &&
    other.maxLocationLength == maxLocationLength &&
    other.maxDetailsShown == maxDetailsShown &&
    other.minDetailsPercentage == minDetailsPercentage &&
    other.threadMatchers == threadMatchers &&
    other.maxGreedyDepth == maxGreedyDepth &&
    other.greedyStackMatchers == greedyStackMatchers &&
    other.stackFilters == stackFilters &&
    other.stackMatchers == stackMatchers &&
    other.stackCategorizers == stackCategorizers &&
    other.stackShorteners == stackShorteners;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enabled == null ? 0 : enabled!.hashCode) +
    (intervalSeconds == null ? 0 : intervalSeconds!.hashCode) +
    (commitsPerIntervalThreshold == null ? 0 : commitsPerIntervalThreshold!.hashCode) +
    (maxLocationLength == null ? 0 : maxLocationLength!.hashCode) +
    (maxDetailsShown == null ? 0 : maxDetailsShown!.hashCode) +
    (minDetailsPercentage == null ? 0 : minDetailsPercentage!.hashCode) +
    (threadMatchers == null ? 0 : threadMatchers!.hashCode) +
    (maxGreedyDepth == null ? 0 : maxGreedyDepth!.hashCode) +
    (greedyStackMatchers == null ? 0 : greedyStackMatchers!.hashCode) +
    (stackFilters == null ? 0 : stackFilters!.hashCode) +
    (stackMatchers == null ? 0 : stackMatchers!.hashCode) +
    (stackCategorizers == null ? 0 : stackCategorizers!.hashCode) +
    (stackShorteners == null ? 0 : stackShorteners!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteRepositoryImplCommitStatsConfigProperties[enabled=$enabled, intervalSeconds=$intervalSeconds, commitsPerIntervalThreshold=$commitsPerIntervalThreshold, maxLocationLength=$maxLocationLength, maxDetailsShown=$maxDetailsShown, minDetailsPercentage=$minDetailsPercentage, threadMatchers=$threadMatchers, maxGreedyDepth=$maxGreedyDepth, greedyStackMatchers=$greedyStackMatchers, stackFilters=$stackFilters, stackMatchers=$stackMatchers, stackCategorizers=$stackCategorizers, stackShorteners=$stackShorteners]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enabled != null) {
      json[r'enabled'] = this.enabled;
    } else {
      json[r'enabled'] = null;
    }
    if (this.intervalSeconds != null) {
      json[r'intervalSeconds'] = this.intervalSeconds;
    } else {
      json[r'intervalSeconds'] = null;
    }
    if (this.commitsPerIntervalThreshold != null) {
      json[r'commitsPerIntervalThreshold'] = this.commitsPerIntervalThreshold;
    } else {
      json[r'commitsPerIntervalThreshold'] = null;
    }
    if (this.maxLocationLength != null) {
      json[r'maxLocationLength'] = this.maxLocationLength;
    } else {
      json[r'maxLocationLength'] = null;
    }
    if (this.maxDetailsShown != null) {
      json[r'maxDetailsShown'] = this.maxDetailsShown;
    } else {
      json[r'maxDetailsShown'] = null;
    }
    if (this.minDetailsPercentage != null) {
      json[r'minDetailsPercentage'] = this.minDetailsPercentage;
    } else {
      json[r'minDetailsPercentage'] = null;
    }
    if (this.threadMatchers != null) {
      json[r'threadMatchers'] = this.threadMatchers;
    } else {
      json[r'threadMatchers'] = null;
    }
    if (this.maxGreedyDepth != null) {
      json[r'maxGreedyDepth'] = this.maxGreedyDepth;
    } else {
      json[r'maxGreedyDepth'] = null;
    }
    if (this.greedyStackMatchers != null) {
      json[r'greedyStackMatchers'] = this.greedyStackMatchers;
    } else {
      json[r'greedyStackMatchers'] = null;
    }
    if (this.stackFilters != null) {
      json[r'stackFilters'] = this.stackFilters;
    } else {
      json[r'stackFilters'] = null;
    }
    if (this.stackMatchers != null) {
      json[r'stackMatchers'] = this.stackMatchers;
    } else {
      json[r'stackMatchers'] = null;
    }
    if (this.stackCategorizers != null) {
      json[r'stackCategorizers'] = this.stackCategorizers;
    } else {
      json[r'stackCategorizers'] = null;
    }
    if (this.stackShorteners != null) {
      json[r'stackShorteners'] = this.stackShorteners;
    } else {
      json[r'stackShorteners'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteRepositoryImplCommitStatsConfigProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteRepositoryImplCommitStatsConfigProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(
        enabled: ConfigNodePropertyBoolean.fromJson(json[r'enabled']),
        intervalSeconds: ConfigNodePropertyInteger.fromJson(json[r'intervalSeconds']),
        commitsPerIntervalThreshold: ConfigNodePropertyInteger.fromJson(json[r'commitsPerIntervalThreshold']),
        maxLocationLength: ConfigNodePropertyInteger.fromJson(json[r'maxLocationLength']),
        maxDetailsShown: ConfigNodePropertyInteger.fromJson(json[r'maxDetailsShown']),
        minDetailsPercentage: ConfigNodePropertyInteger.fromJson(json[r'minDetailsPercentage']),
        threadMatchers: ConfigNodePropertyArray.fromJson(json[r'threadMatchers']),
        maxGreedyDepth: ConfigNodePropertyInteger.fromJson(json[r'maxGreedyDepth']),
        greedyStackMatchers: ConfigNodePropertyString.fromJson(json[r'greedyStackMatchers']),
        stackFilters: ConfigNodePropertyArray.fromJson(json[r'stackFilters']),
        stackMatchers: ConfigNodePropertyArray.fromJson(json[r'stackMatchers']),
        stackCategorizers: ConfigNodePropertyArray.fromJson(json[r'stackCategorizers']),
        stackShorteners: ConfigNodePropertyArray.fromJson(json[r'stackShorteners']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteRepositoryImplCommitStatsConfigProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteRepositoryImplCommitStatsConfigProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteRepositoryImplCommitStatsConfigProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteRepositoryImplCommitStatsConfigProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteRepositoryImplCommitStatsConfigProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteRepositoryImplCommitStatsConfigProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteRepositoryImplCommitStatsConfigProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

