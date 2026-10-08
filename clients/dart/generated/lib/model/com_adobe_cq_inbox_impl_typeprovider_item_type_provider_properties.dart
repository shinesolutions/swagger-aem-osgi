//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties {
  /// Returns a new [ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties] instance.
  ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties({
    this.inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths,
    this.inboxPeriodImplPeriodTypeproviderPeriodLegacypaths,
    this.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem,
    this.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem,
    this.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? inboxPeriodImplPeriodTypeproviderPeriodLegacypaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties &&
    other.inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths == inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths &&
    other.inboxPeriodImplPeriodTypeproviderPeriodLegacypaths == inboxPeriodImplPeriodTypeproviderPeriodLegacypaths &&
    other.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem == inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem &&
    other.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem == inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem &&
    other.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask == inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths == null ? 0 : inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths!.hashCode) +
    (inboxPeriodImplPeriodTypeproviderPeriodLegacypaths == null ? 0 : inboxPeriodImplPeriodTypeproviderPeriodLegacypaths!.hashCode) +
    (inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem == null ? 0 : inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem!.hashCode) +
    (inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem == null ? 0 : inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem!.hashCode) +
    (inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask == null ? 0 : inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask!.hashCode);

  @override
  String toString() => 'ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties[inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths=$inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths, inboxPeriodImplPeriodTypeproviderPeriodLegacypaths=$inboxPeriodImplPeriodTypeproviderPeriodLegacypaths, inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem=$inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem, inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem=$inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem, inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask=$inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths != null) {
      json[r'inbox.impl.typeprovider.registrypaths'] = this.inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths;
    } else {
      json[r'inbox.impl.typeprovider.registrypaths'] = null;
    }
    if (this.inboxPeriodImplPeriodTypeproviderPeriodLegacypaths != null) {
      json[r'inbox.impl.typeprovider.legacypaths'] = this.inboxPeriodImplPeriodTypeproviderPeriodLegacypaths;
    } else {
      json[r'inbox.impl.typeprovider.legacypaths'] = null;
    }
    if (this.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem != null) {
      json[r'inbox.impl.typeprovider.defaulturl.failureitem'] = this.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem;
    } else {
      json[r'inbox.impl.typeprovider.defaulturl.failureitem'] = null;
    }
    if (this.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem != null) {
      json[r'inbox.impl.typeprovider.defaulturl.workitem'] = this.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem;
    } else {
      json[r'inbox.impl.typeprovider.defaulturl.workitem'] = null;
    }
    if (this.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask != null) {
      json[r'inbox.impl.typeprovider.defaulturl.task'] = this.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask;
    } else {
      json[r'inbox.impl.typeprovider.defaulturl.task'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(
        inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths: ConfigNodePropertyArray.fromJson(json[r'inbox.impl.typeprovider.registrypaths']),
        inboxPeriodImplPeriodTypeproviderPeriodLegacypaths: ConfigNodePropertyArray.fromJson(json[r'inbox.impl.typeprovider.legacypaths']),
        inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem: ConfigNodePropertyString.fromJson(json[r'inbox.impl.typeprovider.defaulturl.failureitem']),
        inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem: ConfigNodePropertyString.fromJson(json[r'inbox.impl.typeprovider.defaulturl.workitem']),
        inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask: ConfigNodePropertyString.fromJson(json[r'inbox.impl.typeprovider.defaulturl.task']),
      );
    }
    return null;
  }

  static List<ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

