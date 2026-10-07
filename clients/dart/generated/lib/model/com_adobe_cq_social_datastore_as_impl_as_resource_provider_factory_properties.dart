//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties {
  /// Returns a new [ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties] instance.
  ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties({
    this.versionPeriodId,
    this.cachePeriodOn,
    this.concurrencyPeriodLevel,
    this.cachePeriodStartPeriodSize,
    this.cachePeriodTtl,
    this.cachePeriodSize,
    this.timePeriodLimit,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? versionPeriodId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cachePeriodOn;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? concurrencyPeriodLevel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cachePeriodStartPeriodSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cachePeriodTtl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cachePeriodSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? timePeriodLimit;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties &&
    other.versionPeriodId == versionPeriodId &&
    other.cachePeriodOn == cachePeriodOn &&
    other.concurrencyPeriodLevel == concurrencyPeriodLevel &&
    other.cachePeriodStartPeriodSize == cachePeriodStartPeriodSize &&
    other.cachePeriodTtl == cachePeriodTtl &&
    other.cachePeriodSize == cachePeriodSize &&
    other.timePeriodLimit == timePeriodLimit;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (versionPeriodId == null ? 0 : versionPeriodId!.hashCode) +
    (cachePeriodOn == null ? 0 : cachePeriodOn!.hashCode) +
    (concurrencyPeriodLevel == null ? 0 : concurrencyPeriodLevel!.hashCode) +
    (cachePeriodStartPeriodSize == null ? 0 : cachePeriodStartPeriodSize!.hashCode) +
    (cachePeriodTtl == null ? 0 : cachePeriodTtl!.hashCode) +
    (cachePeriodSize == null ? 0 : cachePeriodSize!.hashCode) +
    (timePeriodLimit == null ? 0 : timePeriodLimit!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties[versionPeriodId=$versionPeriodId, cachePeriodOn=$cachePeriodOn, concurrencyPeriodLevel=$concurrencyPeriodLevel, cachePeriodStartPeriodSize=$cachePeriodStartPeriodSize, cachePeriodTtl=$cachePeriodTtl, cachePeriodSize=$cachePeriodSize, timePeriodLimit=$timePeriodLimit]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.versionPeriodId != null) {
      json[r'version.id'] = this.versionPeriodId;
    } else {
      json[r'version.id'] = null;
    }
    if (this.cachePeriodOn != null) {
      json[r'cache.on'] = this.cachePeriodOn;
    } else {
      json[r'cache.on'] = null;
    }
    if (this.concurrencyPeriodLevel != null) {
      json[r'concurrency.level'] = this.concurrencyPeriodLevel;
    } else {
      json[r'concurrency.level'] = null;
    }
    if (this.cachePeriodStartPeriodSize != null) {
      json[r'cache.start.size'] = this.cachePeriodStartPeriodSize;
    } else {
      json[r'cache.start.size'] = null;
    }
    if (this.cachePeriodTtl != null) {
      json[r'cache.ttl'] = this.cachePeriodTtl;
    } else {
      json[r'cache.ttl'] = null;
    }
    if (this.cachePeriodSize != null) {
      json[r'cache.size'] = this.cachePeriodSize;
    } else {
      json[r'cache.size'] = null;
    }
    if (this.timePeriodLimit != null) {
      json[r'time.limit'] = this.timePeriodLimit;
    } else {
      json[r'time.limit'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties(
        versionPeriodId: ConfigNodePropertyString.fromJson(json[r'version.id']),
        cachePeriodOn: ConfigNodePropertyBoolean.fromJson(json[r'cache.on']),
        concurrencyPeriodLevel: ConfigNodePropertyInteger.fromJson(json[r'concurrency.level']),
        cachePeriodStartPeriodSize: ConfigNodePropertyInteger.fromJson(json[r'cache.start.size']),
        cachePeriodTtl: ConfigNodePropertyInteger.fromJson(json[r'cache.ttl']),
        cachePeriodSize: ConfigNodePropertyInteger.fromJson(json[r'cache.size']),
        timePeriodLimit: ConfigNodePropertyInteger.fromJson(json[r'time.limit']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

