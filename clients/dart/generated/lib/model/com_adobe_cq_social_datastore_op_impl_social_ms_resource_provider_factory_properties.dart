//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties {
  /// Returns a new [ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties] instance.
  ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties({
    this.solrPeriodZkPeriodTimeout,
    this.solrPeriodCommit,
    this.cachePeriodOn,
    this.concurrencyPeriodLevel,
    this.cachePeriodStartPeriodSize,
    this.cachePeriodTtl,
    this.cachePeriodSize,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? solrPeriodZkPeriodTimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? solrPeriodCommit;

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

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties &&
    other.solrPeriodZkPeriodTimeout == solrPeriodZkPeriodTimeout &&
    other.solrPeriodCommit == solrPeriodCommit &&
    other.cachePeriodOn == cachePeriodOn &&
    other.concurrencyPeriodLevel == concurrencyPeriodLevel &&
    other.cachePeriodStartPeriodSize == cachePeriodStartPeriodSize &&
    other.cachePeriodTtl == cachePeriodTtl &&
    other.cachePeriodSize == cachePeriodSize;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (solrPeriodZkPeriodTimeout == null ? 0 : solrPeriodZkPeriodTimeout!.hashCode) +
    (solrPeriodCommit == null ? 0 : solrPeriodCommit!.hashCode) +
    (cachePeriodOn == null ? 0 : cachePeriodOn!.hashCode) +
    (concurrencyPeriodLevel == null ? 0 : concurrencyPeriodLevel!.hashCode) +
    (cachePeriodStartPeriodSize == null ? 0 : cachePeriodStartPeriodSize!.hashCode) +
    (cachePeriodTtl == null ? 0 : cachePeriodTtl!.hashCode) +
    (cachePeriodSize == null ? 0 : cachePeriodSize!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties[solrPeriodZkPeriodTimeout=$solrPeriodZkPeriodTimeout, solrPeriodCommit=$solrPeriodCommit, cachePeriodOn=$cachePeriodOn, concurrencyPeriodLevel=$concurrencyPeriodLevel, cachePeriodStartPeriodSize=$cachePeriodStartPeriodSize, cachePeriodTtl=$cachePeriodTtl, cachePeriodSize=$cachePeriodSize]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.solrPeriodZkPeriodTimeout != null) {
      json[r'solr.zk.timeout'] = this.solrPeriodZkPeriodTimeout;
    } else {
      json[r'solr.zk.timeout'] = null;
    }
    if (this.solrPeriodCommit != null) {
      json[r'solr.commit'] = this.solrPeriodCommit;
    } else {
      json[r'solr.commit'] = null;
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
    return json;
  }

  /// Returns a new [ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties(
        solrPeriodZkPeriodTimeout: ConfigNodePropertyString.fromJson(json[r'solr.zk.timeout']),
        solrPeriodCommit: ConfigNodePropertyString.fromJson(json[r'solr.commit']),
        cachePeriodOn: ConfigNodePropertyBoolean.fromJson(json[r'cache.on']),
        concurrencyPeriodLevel: ConfigNodePropertyInteger.fromJson(json[r'concurrency.level']),
        cachePeriodStartPeriodSize: ConfigNodePropertyInteger.fromJson(json[r'cache.start.size']),
        cachePeriodTtl: ConfigNodePropertyInteger.fromJson(json[r'cache.ttl']),
        cachePeriodSize: ConfigNodePropertyInteger.fromJson(json[r'cache.size']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

