//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties.g.dart';

/// OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties
///
/// Properties:
/// * [servletPath] 
/// * [disabled] 
/// * [corsPeriodAccessControlAllowOrigin] 
@BuiltValue()
abstract class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties implements Built<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties, OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'servletPath')
  ConfigNodePropertyString? get servletPath;

  @BuiltValueField(wireName: r'disabled')
  ConfigNodePropertyBoolean? get disabled;

  @BuiltValueField(wireName: r'cors.accessControlAllowOrigin')
  ConfigNodePropertyString? get corsPeriodAccessControlAllowOrigin;

  OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties._();

  factory OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties([void updates(OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder b)]) = _$OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties> get serializer => _$OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesSerializer();
}

class _$OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties, _$OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties];

  @override
  final String wireName = r'OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servletPath != null) {
      yield r'servletPath';
      yield serializers.serialize(
        object.servletPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.disabled != null) {
      yield r'disabled';
      yield serializers.serialize(
        object.disabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.corsPeriodAccessControlAllowOrigin != null) {
      yield r'cors.accessControlAllowOrigin';
      yield serializers.serialize(
        object.corsPeriodAccessControlAllowOrigin,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'servletPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.servletPath.replace(valueDes);
          break;
        case r'disabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.disabled.replace(valueDes);
          break;
        case r'cors.accessControlAllowOrigin':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.corsPeriodAccessControlAllowOrigin.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesBuilder();
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

