//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties {
  /// Returns a new [ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties] instance.
  ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties({
    this.damPeriodShowexpired,
    this.damPeriodShowhidden,
    this.tagTitleSearch,
    this.guessTotal,
    this.damPeriodExpiryProperty,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? damPeriodShowexpired;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? damPeriodShowhidden;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? tagTitleSearch;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? guessTotal;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? damPeriodExpiryProperty;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties &&
    other.damPeriodShowexpired == damPeriodShowexpired &&
    other.damPeriodShowhidden == damPeriodShowhidden &&
    other.tagTitleSearch == tagTitleSearch &&
    other.guessTotal == guessTotal &&
    other.damPeriodExpiryProperty == damPeriodExpiryProperty;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (damPeriodShowexpired == null ? 0 : damPeriodShowexpired!.hashCode) +
    (damPeriodShowhidden == null ? 0 : damPeriodShowhidden!.hashCode) +
    (tagTitleSearch == null ? 0 : tagTitleSearch!.hashCode) +
    (guessTotal == null ? 0 : guessTotal!.hashCode) +
    (damPeriodExpiryProperty == null ? 0 : damPeriodExpiryProperty!.hashCode);

  @override
  String toString() => 'ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties[damPeriodShowexpired=$damPeriodShowexpired, damPeriodShowhidden=$damPeriodShowhidden, tagTitleSearch=$tagTitleSearch, guessTotal=$guessTotal, damPeriodExpiryProperty=$damPeriodExpiryProperty]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.damPeriodShowexpired != null) {
      json[r'dam.showexpired'] = this.damPeriodShowexpired;
    } else {
      json[r'dam.showexpired'] = null;
    }
    if (this.damPeriodShowhidden != null) {
      json[r'dam.showhidden'] = this.damPeriodShowhidden;
    } else {
      json[r'dam.showhidden'] = null;
    }
    if (this.tagTitleSearch != null) {
      json[r'tagTitleSearch'] = this.tagTitleSearch;
    } else {
      json[r'tagTitleSearch'] = null;
    }
    if (this.guessTotal != null) {
      json[r'guessTotal'] = this.guessTotal;
    } else {
      json[r'guessTotal'] = null;
    }
    if (this.damPeriodExpiryProperty != null) {
      json[r'dam.expiryProperty'] = this.damPeriodExpiryProperty;
    } else {
      json[r'dam.expiryProperty'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(
        damPeriodShowexpired: ConfigNodePropertyBoolean.fromJson(json[r'dam.showexpired']),
        damPeriodShowhidden: ConfigNodePropertyBoolean.fromJson(json[r'dam.showhidden']),
        tagTitleSearch: ConfigNodePropertyBoolean.fromJson(json[r'tagTitleSearch']),
        guessTotal: ConfigNodePropertyString.fromJson(json[r'guessTotal']),
        damPeriodExpiryProperty: ConfigNodePropertyString.fromJson(json[r'dam.expiryProperty']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

