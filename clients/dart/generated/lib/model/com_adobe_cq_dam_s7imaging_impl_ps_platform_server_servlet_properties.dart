//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {
  /// Returns a new [ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties] instance.
  ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties({
    this.cachePeriodEnable,
    this.cachePeriodRootPaths,
    this.cachePeriodMaxSize,
    this.cachePeriodMaxEntries,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cachePeriodEnable;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cachePeriodRootPaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cachePeriodMaxSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cachePeriodMaxEntries;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties &&
    other.cachePeriodEnable == cachePeriodEnable &&
    other.cachePeriodRootPaths == cachePeriodRootPaths &&
    other.cachePeriodMaxSize == cachePeriodMaxSize &&
    other.cachePeriodMaxEntries == cachePeriodMaxEntries;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cachePeriodEnable == null ? 0 : cachePeriodEnable!.hashCode) +
    (cachePeriodRootPaths == null ? 0 : cachePeriodRootPaths!.hashCode) +
    (cachePeriodMaxSize == null ? 0 : cachePeriodMaxSize!.hashCode) +
    (cachePeriodMaxEntries == null ? 0 : cachePeriodMaxEntries!.hashCode);

  @override
  String toString() => 'ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties[cachePeriodEnable=$cachePeriodEnable, cachePeriodRootPaths=$cachePeriodRootPaths, cachePeriodMaxSize=$cachePeriodMaxSize, cachePeriodMaxEntries=$cachePeriodMaxEntries]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cachePeriodEnable != null) {
      json[r'cache.enable'] = this.cachePeriodEnable;
    } else {
      json[r'cache.enable'] = null;
    }
    if (this.cachePeriodRootPaths != null) {
      json[r'cache.rootPaths'] = this.cachePeriodRootPaths;
    } else {
      json[r'cache.rootPaths'] = null;
    }
    if (this.cachePeriodMaxSize != null) {
      json[r'cache.maxSize'] = this.cachePeriodMaxSize;
    } else {
      json[r'cache.maxSize'] = null;
    }
    if (this.cachePeriodMaxEntries != null) {
      json[r'cache.maxEntries'] = this.cachePeriodMaxEntries;
    } else {
      json[r'cache.maxEntries'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(
        cachePeriodEnable: ConfigNodePropertyBoolean.fromJson(json[r'cache.enable']),
        cachePeriodRootPaths: ConfigNodePropertyArray.fromJson(json[r'cache.rootPaths']),
        cachePeriodMaxSize: ConfigNodePropertyInteger.fromJson(json[r'cache.maxSize']),
        cachePeriodMaxEntries: ConfigNodePropertyInteger.fromJson(json[r'cache.maxEntries']),
      );
    }
    return null;
  }

  static List<ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

