//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties {
  /// Returns a new [ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties] instance.
  ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties({
    this.pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault,
    this.pagePeriodInfoPeriodProviderPeriodPropertyPeriodName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? pagePeriodInfoPeriodProviderPeriodPropertyPeriodName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties &&
    other.pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault == pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault &&
    other.pagePeriodInfoPeriodProviderPeriodPropertyPeriodName == pagePeriodInfoPeriodProviderPeriodPropertyPeriodName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault == null ? 0 : pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault!.hashCode) +
    (pagePeriodInfoPeriodProviderPeriodPropertyPeriodName == null ? 0 : pagePeriodInfoPeriodProviderPeriodPropertyPeriodName!.hashCode);

  @override
  String toString() => 'ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties[pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault=$pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault, pagePeriodInfoPeriodProviderPeriodPropertyPeriodName=$pagePeriodInfoPeriodProviderPeriodPropertyPeriodName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault != null) {
      json[r'page.info.provider.property.regex.default'] = this.pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault;
    } else {
      json[r'page.info.provider.property.regex.default'] = null;
    }
    if (this.pagePeriodInfoPeriodProviderPeriodPropertyPeriodName != null) {
      json[r'page.info.provider.property.name'] = this.pagePeriodInfoPeriodProviderPeriodPropertyPeriodName;
    } else {
      json[r'page.info.provider.property.name'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties(
        pagePeriodInfoPeriodProviderPeriodPropertyPeriodRegexPeriodDefault: ConfigNodePropertyString.fromJson(json[r'page.info.provider.property.regex.default']),
        pagePeriodInfoPeriodProviderPeriodPropertyPeriodName: ConfigNodePropertyString.fromJson(json[r'page.info.provider.property.name']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

