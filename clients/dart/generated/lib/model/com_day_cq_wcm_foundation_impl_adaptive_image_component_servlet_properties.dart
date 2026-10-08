//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties {
  /// Returns a new [ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties] instance.
  ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties({
    this.adaptPeriodSupportedPeriodWidths,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? adaptPeriodSupportedPeriodWidths;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties &&
    other.adaptPeriodSupportedPeriodWidths == adaptPeriodSupportedPeriodWidths;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adaptPeriodSupportedPeriodWidths == null ? 0 : adaptPeriodSupportedPeriodWidths!.hashCode);

  @override
  String toString() => 'ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties[adaptPeriodSupportedPeriodWidths=$adaptPeriodSupportedPeriodWidths]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adaptPeriodSupportedPeriodWidths != null) {
      json[r'adapt.supported.widths'] = this.adaptPeriodSupportedPeriodWidths;
    } else {
      json[r'adapt.supported.widths'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties(
        adaptPeriodSupportedPeriodWidths: ConfigNodePropertyArray.fromJson(json[r'adapt.supported.widths']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

