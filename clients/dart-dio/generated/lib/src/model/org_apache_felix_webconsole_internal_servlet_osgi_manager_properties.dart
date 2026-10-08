//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_webconsole_internal_servlet_osgi_manager_properties.g.dart';

/// OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties
///
/// Properties:
/// * [managerPeriodRoot] 
/// * [httpPeriodServicePeriodFilter] 
/// * [defaultPeriodRender] 
/// * [realm] 
/// * [username] 
/// * [password] 
/// * [category] 
/// * [locale] 
/// * [loglevel] 
/// * [plugins] 
@BuiltValue()
abstract class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties implements Built<OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties, OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder> {
  @BuiltValueField(wireName: r'manager.root')
  ConfigNodePropertyString? get managerPeriodRoot;

  @BuiltValueField(wireName: r'http.service.filter')
  ConfigNodePropertyString? get httpPeriodServicePeriodFilter;

  @BuiltValueField(wireName: r'default.render')
  ConfigNodePropertyString? get defaultPeriodRender;

  @BuiltValueField(wireName: r'realm')
  ConfigNodePropertyString? get realm;

  @BuiltValueField(wireName: r'username')
  ConfigNodePropertyString? get username;

  @BuiltValueField(wireName: r'password')
  ConfigNodePropertyString? get password;

  @BuiltValueField(wireName: r'category')
  ConfigNodePropertyString? get category;

  @BuiltValueField(wireName: r'locale')
  ConfigNodePropertyString? get locale;

  @BuiltValueField(wireName: r'loglevel')
  ConfigNodePropertyDropDown? get loglevel;

  @BuiltValueField(wireName: r'plugins')
  ConfigNodePropertyDropDown? get plugins;

  OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties._();

  factory OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties([void updates(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder b)]) = _$OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties> get serializer => _$OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesSerializer();
}

class _$OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties, _$OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties];

  @override
  final String wireName = r'OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.managerPeriodRoot != null) {
      yield r'manager.root';
      yield serializers.serialize(
        object.managerPeriodRoot,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.httpPeriodServicePeriodFilter != null) {
      yield r'http.service.filter';
      yield serializers.serialize(
        object.httpPeriodServicePeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultPeriodRender != null) {
      yield r'default.render';
      yield serializers.serialize(
        object.defaultPeriodRender,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.realm != null) {
      yield r'realm';
      yield serializers.serialize(
        object.realm,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.username != null) {
      yield r'username';
      yield serializers.serialize(
        object.username,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.password != null) {
      yield r'password';
      yield serializers.serialize(
        object.password,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.category != null) {
      yield r'category';
      yield serializers.serialize(
        object.category,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.locale != null) {
      yield r'locale';
      yield serializers.serialize(
        object.locale,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.loglevel != null) {
      yield r'loglevel';
      yield serializers.serialize(
        object.loglevel,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.plugins != null) {
      yield r'plugins';
      yield serializers.serialize(
        object.plugins,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'manager.root':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.managerPeriodRoot.replace(valueDes);
          break;
        case r'http.service.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.httpPeriodServicePeriodFilter.replace(valueDes);
          break;
        case r'default.render':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultPeriodRender.replace(valueDes);
          break;
        case r'realm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.realm.replace(valueDes);
          break;
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.username.replace(valueDes);
          break;
        case r'password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.password.replace(valueDes);
          break;
        case r'category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.category.replace(valueDes);
          break;
        case r'locale':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.locale.replace(valueDes);
          break;
        case r'loglevel':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.loglevel.replace(valueDes);
          break;
        case r'plugins':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.plugins.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

