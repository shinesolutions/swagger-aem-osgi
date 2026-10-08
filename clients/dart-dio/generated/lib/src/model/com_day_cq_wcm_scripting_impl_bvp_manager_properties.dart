//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_scripting_impl_bvp_manager_properties.g.dart';

/// ComDayCqWcmScriptingImplBVPManagerProperties
///
/// Properties:
/// * [comPeriodDayPeriodCqPeriodWcmPeriodScriptingPeriodBvpPeriodScriptPeriodEngines] 
@BuiltValue()
abstract class ComDayCqWcmScriptingImplBVPManagerProperties implements Built<ComDayCqWcmScriptingImplBVPManagerProperties, ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder> {
  @BuiltValueField(wireName: r'com.day.cq.wcm.scripting.bvp.script.engines')
  ConfigNodePropertyArray? get comPeriodDayPeriodCqPeriodWcmPeriodScriptingPeriodBvpPeriodScriptPeriodEngines;

  ComDayCqWcmScriptingImplBVPManagerProperties._();

  factory ComDayCqWcmScriptingImplBVPManagerProperties([void updates(ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder b)]) = _$ComDayCqWcmScriptingImplBVPManagerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmScriptingImplBVPManagerProperties> get serializer => _$ComDayCqWcmScriptingImplBVPManagerPropertiesSerializer();
}

class _$ComDayCqWcmScriptingImplBVPManagerPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmScriptingImplBVPManagerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmScriptingImplBVPManagerProperties, _$ComDayCqWcmScriptingImplBVPManagerProperties];

  @override
  final String wireName = r'ComDayCqWcmScriptingImplBVPManagerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmScriptingImplBVPManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodDayPeriodCqPeriodWcmPeriodScriptingPeriodBvpPeriodScriptPeriodEngines != null) {
      yield r'com.day.cq.wcm.scripting.bvp.script.engines';
      yield serializers.serialize(
        object.comPeriodDayPeriodCqPeriodWcmPeriodScriptingPeriodBvpPeriodScriptPeriodEngines,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmScriptingImplBVPManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.day.cq.wcm.scripting.bvp.script.engines':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.comPeriodDayPeriodCqPeriodWcmPeriodScriptingPeriodBvpPeriodScriptPeriodEngines.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmScriptingImplBVPManagerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder();
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

