//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqHistoryImplHistoryRequestFilterProperties {
  /// Returns a new [ComAdobeCqHistoryImplHistoryRequestFilterProperties] instance.
  ComAdobeCqHistoryImplHistoryRequestFilterProperties({
    this.historyPeriodRequestFilterPeriodExcludedSelectors,
    this.historyPeriodRequestFilterPeriodExcludedExtensions,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? historyPeriodRequestFilterPeriodExcludedSelectors;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? historyPeriodRequestFilterPeriodExcludedExtensions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqHistoryImplHistoryRequestFilterProperties &&
    other.historyPeriodRequestFilterPeriodExcludedSelectors == historyPeriodRequestFilterPeriodExcludedSelectors &&
    other.historyPeriodRequestFilterPeriodExcludedExtensions == historyPeriodRequestFilterPeriodExcludedExtensions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (historyPeriodRequestFilterPeriodExcludedSelectors == null ? 0 : historyPeriodRequestFilterPeriodExcludedSelectors!.hashCode) +
    (historyPeriodRequestFilterPeriodExcludedExtensions == null ? 0 : historyPeriodRequestFilterPeriodExcludedExtensions!.hashCode);

  @override
  String toString() => 'ComAdobeCqHistoryImplHistoryRequestFilterProperties[historyPeriodRequestFilterPeriodExcludedSelectors=$historyPeriodRequestFilterPeriodExcludedSelectors, historyPeriodRequestFilterPeriodExcludedExtensions=$historyPeriodRequestFilterPeriodExcludedExtensions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.historyPeriodRequestFilterPeriodExcludedSelectors != null) {
      json[r'history.requestFilter.excludedSelectors'] = this.historyPeriodRequestFilterPeriodExcludedSelectors;
    } else {
      json[r'history.requestFilter.excludedSelectors'] = null;
    }
    if (this.historyPeriodRequestFilterPeriodExcludedExtensions != null) {
      json[r'history.requestFilter.excludedExtensions'] = this.historyPeriodRequestFilterPeriodExcludedExtensions;
    } else {
      json[r'history.requestFilter.excludedExtensions'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqHistoryImplHistoryRequestFilterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqHistoryImplHistoryRequestFilterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqHistoryImplHistoryRequestFilterProperties(
        historyPeriodRequestFilterPeriodExcludedSelectors: ConfigNodePropertyArray.fromJson(json[r'history.requestFilter.excludedSelectors']),
        historyPeriodRequestFilterPeriodExcludedExtensions: ConfigNodePropertyArray.fromJson(json[r'history.requestFilter.excludedExtensions']),
      );
    }
    return null;
  }

  static List<ComAdobeCqHistoryImplHistoryRequestFilterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqHistoryImplHistoryRequestFilterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqHistoryImplHistoryRequestFilterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqHistoryImplHistoryRequestFilterProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqHistoryImplHistoryRequestFilterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqHistoryImplHistoryRequestFilterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqHistoryImplHistoryRequestFilterProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqHistoryImplHistoryRequestFilterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqHistoryImplHistoryRequestFilterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqHistoryImplHistoryRequestFilterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

