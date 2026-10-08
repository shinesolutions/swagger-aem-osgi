//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_properties.g.dart';

/// ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties
///
/// Properties:
/// * [slingPeriodPostPeriodOperation] 
/// * [slingPeriodServletPeriodMethods] 
@BuiltValue()
abstract class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties implements Built<ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties, ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.post.operation')
  ConfigNodePropertyString? get slingPeriodPostPeriodOperation;

  @BuiltValueField(wireName: r'sling.servlet.methods')
  ConfigNodePropertyString? get slingPeriodServletPeriodMethods;

  ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties._();

  factory ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties([void updates(ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder b)]) = _$ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties> get serializer => _$ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesSerializer();
}

class _$ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties, _$ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties object, {
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
    ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder result,
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
  ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder();
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

