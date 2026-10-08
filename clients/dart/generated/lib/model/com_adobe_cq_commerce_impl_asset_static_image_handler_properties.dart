//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties {
  /// Returns a new [ComAdobeCqCommerceImplAssetStaticImageHandlerProperties] instance.
  ComAdobeCqCommerceImplAssetStaticImageHandlerProperties({
    this.cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive,
    this.cqPeriodCommercePeriodAssetPeriodHandlerPeriodName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodCommercePeriodAssetPeriodHandlerPeriodName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqCommerceImplAssetStaticImageHandlerProperties &&
    other.cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive == cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive &&
    other.cqPeriodCommercePeriodAssetPeriodHandlerPeriodName == cqPeriodCommercePeriodAssetPeriodHandlerPeriodName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive == null ? 0 : cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive!.hashCode) +
    (cqPeriodCommercePeriodAssetPeriodHandlerPeriodName == null ? 0 : cqPeriodCommercePeriodAssetPeriodHandlerPeriodName!.hashCode);

  @override
  String toString() => 'ComAdobeCqCommerceImplAssetStaticImageHandlerProperties[cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive=$cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive, cqPeriodCommercePeriodAssetPeriodHandlerPeriodName=$cqPeriodCommercePeriodAssetPeriodHandlerPeriodName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive != null) {
      json[r'cq.commerce.asset.handler.active'] = this.cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive;
    } else {
      json[r'cq.commerce.asset.handler.active'] = null;
    }
    if (this.cqPeriodCommercePeriodAssetPeriodHandlerPeriodName != null) {
      json[r'cq.commerce.asset.handler.name'] = this.cqPeriodCommercePeriodAssetPeriodHandlerPeriodName;
    } else {
      json[r'cq.commerce.asset.handler.name'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqCommerceImplAssetStaticImageHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqCommerceImplAssetStaticImageHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqCommerceImplAssetStaticImageHandlerProperties(
        cqPeriodCommercePeriodAssetPeriodHandlerPeriodActive: ConfigNodePropertyBoolean.fromJson(json[r'cq.commerce.asset.handler.active']),
        cqPeriodCommercePeriodAssetPeriodHandlerPeriodName: ConfigNodePropertyString.fromJson(json[r'cq.commerce.asset.handler.name']),
      );
    }
    return null;
  }

  static List<ComAdobeCqCommerceImplAssetStaticImageHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqCommerceImplAssetStaticImageHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqCommerceImplAssetStaticImageHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqCommerceImplAssetStaticImageHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqCommerceImplAssetStaticImageHandlerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqCommerceImplAssetStaticImageHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqCommerceImplAssetStaticImageHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

