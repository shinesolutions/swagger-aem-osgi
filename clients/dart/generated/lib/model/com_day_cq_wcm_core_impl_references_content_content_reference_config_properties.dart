//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties {
  /// Returns a new [ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties] instance.
  ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties({
    this.contentReferenceConfigPeriodResourceTypes,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? contentReferenceConfigPeriodResourceTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties &&
    other.contentReferenceConfigPeriodResourceTypes == contentReferenceConfigPeriodResourceTypes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (contentReferenceConfigPeriodResourceTypes == null ? 0 : contentReferenceConfigPeriodResourceTypes!.hashCode);

  @override
  String toString() => 'ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties[contentReferenceConfigPeriodResourceTypes=$contentReferenceConfigPeriodResourceTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.contentReferenceConfigPeriodResourceTypes != null) {
      json[r'contentReferenceConfig.resourceTypes'] = this.contentReferenceConfigPeriodResourceTypes;
    } else {
      json[r'contentReferenceConfig.resourceTypes'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties(
        contentReferenceConfigPeriodResourceTypes: ConfigNodePropertyArray.fromJson(json[r'contentReferenceConfig.resourceTypes']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

