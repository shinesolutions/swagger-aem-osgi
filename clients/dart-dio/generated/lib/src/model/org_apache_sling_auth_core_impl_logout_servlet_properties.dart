//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_auth_core_impl_logout_servlet_properties.g.dart';

/// OrgApacheSlingAuthCoreImplLogoutServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodMethods] 
/// * [slingPeriodServletPeriodPaths] 
@BuiltValue()
abstract class OrgApacheSlingAuthCoreImplLogoutServletProperties implements Built<OrgApacheSlingAuthCoreImplLogoutServletProperties, OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.methods')
  ConfigNodePropertyArray? get slingPeriodServletPeriodMethods;

  @BuiltValueField(wireName: r'sling.servlet.paths')
  ConfigNodePropertyString? get slingPeriodServletPeriodPaths;

  OrgApacheSlingAuthCoreImplLogoutServletProperties._();

  factory OrgApacheSlingAuthCoreImplLogoutServletProperties([void updates(OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder b)]) = _$OrgApacheSlingAuthCoreImplLogoutServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingAuthCoreImplLogoutServletProperties> get serializer => _$OrgApacheSlingAuthCoreImplLogoutServletPropertiesSerializer();
}

class _$OrgApacheSlingAuthCoreImplLogoutServletPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingAuthCoreImplLogoutServletProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingAuthCoreImplLogoutServletProperties, _$OrgApacheSlingAuthCoreImplLogoutServletProperties];

  @override
  final String wireName = r'OrgApacheSlingAuthCoreImplLogoutServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingAuthCoreImplLogoutServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodMethods != null) {
      yield r'sling.servlet.methods';
      yield serializers.serialize(
        object.slingPeriodServletPeriodMethods,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.slingPeriodServletPeriodPaths != null) {
      yield r'sling.servlet.paths';
      yield serializers.serialize(
        object.slingPeriodServletPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingAuthCoreImplLogoutServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.methods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodMethods.replace(valueDes);
          break;
        case r'sling.servlet.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodPaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingAuthCoreImplLogoutServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder();
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

