//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties {
  /// Returns a new [ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties] instance.
  ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties({
    this.attachmentTypeBlacklist,
    this.extensionPeriodOrder,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? attachmentTypeBlacklist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? extensionPeriodOrder;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties &&
    other.attachmentTypeBlacklist == attachmentTypeBlacklist &&
    other.extensionPeriodOrder == extensionPeriodOrder;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attachmentTypeBlacklist == null ? 0 : attachmentTypeBlacklist!.hashCode) +
    (extensionPeriodOrder == null ? 0 : extensionPeriodOrder!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties[attachmentTypeBlacklist=$attachmentTypeBlacklist, extensionPeriodOrder=$extensionPeriodOrder]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.attachmentTypeBlacklist != null) {
      json[r'attachmentTypeBlacklist'] = this.attachmentTypeBlacklist;
    } else {
      json[r'attachmentTypeBlacklist'] = null;
    }
    if (this.extensionPeriodOrder != null) {
      json[r'extension.order'] = this.extensionPeriodOrder;
    } else {
      json[r'extension.order'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties(
        attachmentTypeBlacklist: ConfigNodePropertyString.fromJson(json[r'attachmentTypeBlacklist']),
        extensionPeriodOrder: ConfigNodePropertyInteger.fromJson(json[r'extension.order']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

