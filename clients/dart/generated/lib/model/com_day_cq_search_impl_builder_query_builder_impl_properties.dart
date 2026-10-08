//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqSearchImplBuilderQueryBuilderImplProperties {
  /// Returns a new [ComDayCqSearchImplBuilderQueryBuilderImplProperties] instance.
  ComDayCqSearchImplBuilderQueryBuilderImplProperties({
    this.excerptPeriodProperties,
    this.cachePeriodMaxPeriodEntries,
    this.cachePeriodEntryPeriodLifetime,
    this.xpathPeriodUnion,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? excerptPeriodProperties;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cachePeriodMaxPeriodEntries;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cachePeriodEntryPeriodLifetime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? xpathPeriodUnion;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqSearchImplBuilderQueryBuilderImplProperties &&
    other.excerptPeriodProperties == excerptPeriodProperties &&
    other.cachePeriodMaxPeriodEntries == cachePeriodMaxPeriodEntries &&
    other.cachePeriodEntryPeriodLifetime == cachePeriodEntryPeriodLifetime &&
    other.xpathPeriodUnion == xpathPeriodUnion;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (excerptPeriodProperties == null ? 0 : excerptPeriodProperties!.hashCode) +
    (cachePeriodMaxPeriodEntries == null ? 0 : cachePeriodMaxPeriodEntries!.hashCode) +
    (cachePeriodEntryPeriodLifetime == null ? 0 : cachePeriodEntryPeriodLifetime!.hashCode) +
    (xpathPeriodUnion == null ? 0 : xpathPeriodUnion!.hashCode);

  @override
  String toString() => 'ComDayCqSearchImplBuilderQueryBuilderImplProperties[excerptPeriodProperties=$excerptPeriodProperties, cachePeriodMaxPeriodEntries=$cachePeriodMaxPeriodEntries, cachePeriodEntryPeriodLifetime=$cachePeriodEntryPeriodLifetime, xpathPeriodUnion=$xpathPeriodUnion]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.excerptPeriodProperties != null) {
      json[r'excerpt.properties'] = this.excerptPeriodProperties;
    } else {
      json[r'excerpt.properties'] = null;
    }
    if (this.cachePeriodMaxPeriodEntries != null) {
      json[r'cache.max.entries'] = this.cachePeriodMaxPeriodEntries;
    } else {
      json[r'cache.max.entries'] = null;
    }
    if (this.cachePeriodEntryPeriodLifetime != null) {
      json[r'cache.entry.lifetime'] = this.cachePeriodEntryPeriodLifetime;
    } else {
      json[r'cache.entry.lifetime'] = null;
    }
    if (this.xpathPeriodUnion != null) {
      json[r'xpath.union'] = this.xpathPeriodUnion;
    } else {
      json[r'xpath.union'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqSearchImplBuilderQueryBuilderImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqSearchImplBuilderQueryBuilderImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqSearchImplBuilderQueryBuilderImplProperties(
        excerptPeriodProperties: ConfigNodePropertyArray.fromJson(json[r'excerpt.properties']),
        cachePeriodMaxPeriodEntries: ConfigNodePropertyInteger.fromJson(json[r'cache.max.entries']),
        cachePeriodEntryPeriodLifetime: ConfigNodePropertyInteger.fromJson(json[r'cache.entry.lifetime']),
        xpathPeriodUnion: ConfigNodePropertyBoolean.fromJson(json[r'xpath.union']),
      );
    }
    return null;
  }

  static List<ComDayCqSearchImplBuilderQueryBuilderImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqSearchImplBuilderQueryBuilderImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqSearchImplBuilderQueryBuilderImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqSearchImplBuilderQueryBuilderImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqSearchImplBuilderQueryBuilderImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqSearchImplBuilderQueryBuilderImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqSearchImplBuilderQueryBuilderImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqSearchImplBuilderQueryBuilderImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqSearchImplBuilderQueryBuilderImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqSearchImplBuilderQueryBuilderImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

