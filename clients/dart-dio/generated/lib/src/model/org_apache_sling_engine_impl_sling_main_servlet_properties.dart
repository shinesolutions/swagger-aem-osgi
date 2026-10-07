//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_engine_impl_sling_main_servlet_properties.g.dart';

/// OrgApacheSlingEngineImplSlingMainServletProperties
///
/// Properties:
/// * [slingPeriodMaxPeriodCalls] 
/// * [slingPeriodMaxPeriodInclusions] 
/// * [slingPeriodTracePeriodAllow] 
/// * [slingPeriodMaxPeriodRecordPeriodRequests] 
/// * [slingPeriodStorePeriodPatternPeriodRequests] 
/// * [slingPeriodServerinfo] 
/// * [slingPeriodAdditionalPeriodResponsePeriodHeaders] 
@BuiltValue()
abstract class OrgApacheSlingEngineImplSlingMainServletProperties implements Built<OrgApacheSlingEngineImplSlingMainServletProperties, OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.max.calls')
  ConfigNodePropertyInteger? get slingPeriodMaxPeriodCalls;

  @BuiltValueField(wireName: r'sling.max.inclusions')
  ConfigNodePropertyInteger? get slingPeriodMaxPeriodInclusions;

  @BuiltValueField(wireName: r'sling.trace.allow')
  ConfigNodePropertyBoolean? get slingPeriodTracePeriodAllow;

  @BuiltValueField(wireName: r'sling.max.record.requests')
  ConfigNodePropertyInteger? get slingPeriodMaxPeriodRecordPeriodRequests;

  @BuiltValueField(wireName: r'sling.store.pattern.requests')
  ConfigNodePropertyArray? get slingPeriodStorePeriodPatternPeriodRequests;

  @BuiltValueField(wireName: r'sling.serverinfo')
  ConfigNodePropertyString? get slingPeriodServerinfo;

  @BuiltValueField(wireName: r'sling.additional.response.headers')
  ConfigNodePropertyArray? get slingPeriodAdditionalPeriodResponsePeriodHeaders;

  OrgApacheSlingEngineImplSlingMainServletProperties._();

  factory OrgApacheSlingEngineImplSlingMainServletProperties([void updates(OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder b)]) = _$OrgApacheSlingEngineImplSlingMainServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEngineImplSlingMainServletProperties> get serializer => _$OrgApacheSlingEngineImplSlingMainServletPropertiesSerializer();
}

class _$OrgApacheSlingEngineImplSlingMainServletPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingEngineImplSlingMainServletProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEngineImplSlingMainServletProperties, _$OrgApacheSlingEngineImplSlingMainServletProperties];

  @override
  final String wireName = r'OrgApacheSlingEngineImplSlingMainServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEngineImplSlingMainServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodMaxPeriodCalls != null) {
      yield r'sling.max.calls';
      yield serializers.serialize(
        object.slingPeriodMaxPeriodCalls,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.slingPeriodMaxPeriodInclusions != null) {
      yield r'sling.max.inclusions';
      yield serializers.serialize(
        object.slingPeriodMaxPeriodInclusions,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.slingPeriodTracePeriodAllow != null) {
      yield r'sling.trace.allow';
      yield serializers.serialize(
        object.slingPeriodTracePeriodAllow,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.slingPeriodMaxPeriodRecordPeriodRequests != null) {
      yield r'sling.max.record.requests';
      yield serializers.serialize(
        object.slingPeriodMaxPeriodRecordPeriodRequests,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.slingPeriodStorePeriodPatternPeriodRequests != null) {
      yield r'sling.store.pattern.requests';
      yield serializers.serialize(
        object.slingPeriodStorePeriodPatternPeriodRequests,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.slingPeriodServerinfo != null) {
      yield r'sling.serverinfo';
      yield serializers.serialize(
        object.slingPeriodServerinfo,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodAdditionalPeriodResponsePeriodHeaders != null) {
      yield r'sling.additional.response.headers';
      yield serializers.serialize(
        object.slingPeriodAdditionalPeriodResponsePeriodHeaders,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEngineImplSlingMainServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.max.calls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.slingPeriodMaxPeriodCalls.replace(valueDes);
          break;
        case r'sling.max.inclusions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.slingPeriodMaxPeriodInclusions.replace(valueDes);
          break;
        case r'sling.trace.allow':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.slingPeriodTracePeriodAllow.replace(valueDes);
          break;
        case r'sling.max.record.requests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.slingPeriodMaxPeriodRecordPeriodRequests.replace(valueDes);
          break;
        case r'sling.store.pattern.requests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodStorePeriodPatternPeriodRequests.replace(valueDes);
          break;
        case r'sling.serverinfo':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServerinfo.replace(valueDes);
          break;
        case r'sling.additional.response.headers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodAdditionalPeriodResponsePeriodHeaders.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEngineImplSlingMainServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder();
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

