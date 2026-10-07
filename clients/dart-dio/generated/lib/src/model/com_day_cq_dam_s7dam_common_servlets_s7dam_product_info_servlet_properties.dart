//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties.g.dart';

/// ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodPaths] 
/// * [slingPeriodServletPeriodMethods] 
@BuiltValue()
abstract class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties implements Built<ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties, ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.paths')
  ConfigNodePropertyString? get slingPeriodServletPeriodPaths;

  @BuiltValueField(wireName: r'sling.servlet.methods')
  ConfigNodePropertyString? get slingPeriodServletPeriodMethods;

  ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties._();

  factory ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties([void updates(ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder b)]) = _$ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties> get serializer => _$ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesSerializer();
}

class _$ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties, _$ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties];

  @override
  final String wireName = r'ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodPaths != null) {
      yield r'sling.servlet.paths';
      yield serializers.serialize(
        object.slingPeriodServletPeriodPaths,
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
    ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodPaths.replace(valueDes);
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
  ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder();
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

