//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {
  /// Returns a new [ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties] instance.
  ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties({
    this.mimePeriodAllowEmpty,
    this.mimePeriodAllowed,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? mimePeriodAllowEmpty;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? mimePeriodAllowed;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties &&
    other.mimePeriodAllowEmpty == mimePeriodAllowEmpty &&
    other.mimePeriodAllowed == mimePeriodAllowed;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (mimePeriodAllowEmpty == null ? 0 : mimePeriodAllowEmpty!.hashCode) +
    (mimePeriodAllowed == null ? 0 : mimePeriodAllowed!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties[mimePeriodAllowEmpty=$mimePeriodAllowEmpty, mimePeriodAllowed=$mimePeriodAllowed]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.mimePeriodAllowEmpty != null) {
      json[r'mime.allowEmpty'] = this.mimePeriodAllowEmpty;
    } else {
      json[r'mime.allowEmpty'] = null;
    }
    if (this.mimePeriodAllowed != null) {
      json[r'mime.allowed'] = this.mimePeriodAllowed;
    } else {
      json[r'mime.allowed'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties(
        mimePeriodAllowEmpty: ConfigNodePropertyBoolean.fromJson(json[r'mime.allowEmpty']),
        mimePeriodAllowed: ConfigNodePropertyArray.fromJson(json[r'mime.allowed']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

