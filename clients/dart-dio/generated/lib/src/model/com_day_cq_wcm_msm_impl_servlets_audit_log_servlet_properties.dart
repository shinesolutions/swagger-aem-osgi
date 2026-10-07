//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties.g.dart';

/// ComDayCqWcmMsmImplServletsAuditLogServletProperties
///
/// Properties:
/// * [auditlogservletPeriodDefaultPeriodEventsPeriodCount] 
/// * [auditlogservletPeriodDefaultPeriodPath] 
@BuiltValue()
abstract class ComDayCqWcmMsmImplServletsAuditLogServletProperties implements Built<ComDayCqWcmMsmImplServletsAuditLogServletProperties, ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'auditlogservlet.default.events.count')
  ConfigNodePropertyInteger? get auditlogservletPeriodDefaultPeriodEventsPeriodCount;

  @BuiltValueField(wireName: r'auditlogservlet.default.path')
  ConfigNodePropertyString? get auditlogservletPeriodDefaultPeriodPath;

  ComDayCqWcmMsmImplServletsAuditLogServletProperties._();

  factory ComDayCqWcmMsmImplServletsAuditLogServletProperties([void updates(ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder b)]) = _$ComDayCqWcmMsmImplServletsAuditLogServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmMsmImplServletsAuditLogServletProperties> get serializer => _$ComDayCqWcmMsmImplServletsAuditLogServletPropertiesSerializer();
}

class _$ComDayCqWcmMsmImplServletsAuditLogServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmMsmImplServletsAuditLogServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmMsmImplServletsAuditLogServletProperties, _$ComDayCqWcmMsmImplServletsAuditLogServletProperties];

  @override
  final String wireName = r'ComDayCqWcmMsmImplServletsAuditLogServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmMsmImplServletsAuditLogServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.auditlogservletPeriodDefaultPeriodEventsPeriodCount != null) {
      yield r'auditlogservlet.default.events.count';
      yield serializers.serialize(
        object.auditlogservletPeriodDefaultPeriodEventsPeriodCount,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.auditlogservletPeriodDefaultPeriodPath != null) {
      yield r'auditlogservlet.default.path';
      yield serializers.serialize(
        object.auditlogservletPeriodDefaultPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmMsmImplServletsAuditLogServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'auditlogservlet.default.events.count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.auditlogservletPeriodDefaultPeriodEventsPeriodCount.replace(valueDes);
          break;
        case r'auditlogservlet.default.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.auditlogservletPeriodDefaultPeriodPath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmMsmImplServletsAuditLogServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder();
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

