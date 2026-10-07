//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_properties.g.dart';

/// ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties
///
/// Properties:
/// * [slingPeriodPostPeriodOperation] 
/// * [slingPeriodServletPeriodMethods] 
@BuiltValue()
abstract class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties implements Built<ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties, ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.post.operation')
  ConfigNodePropertyString? get slingPeriodPostPeriodOperation;

  @BuiltValueField(wireName: r'sling.servlet.methods')
  ConfigNodePropertyString? get slingPeriodServletPeriodMethods;

  ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties._();

  factory ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties([void updates(ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder b)]) = _$ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties> get serializer => _$ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesSerializer();
}

class _$ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties, _$ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodPostPeriodOperation != null) {
      yield r'sling.post.operation';
      yield serializers.serialize(
        object.slingPeriodPostPeriodOperation,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodMethods != null) {
      yield r'sling.servlet.methods';
      yield serializers.serialize(
        object.slingPeriodServletPeriodMethods,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.post.operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodPostPeriodOperation.replace(valueDes);
          break;
        case r'sling.servlet.methods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodMethods.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder();
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

