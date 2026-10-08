//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties.g.dart';

/// ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties
///
/// Properties:
/// * [namePeriodWhitelist] 
/// * [allowPeriodExpressions] 
@BuiltValue()
abstract class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties implements Built<ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties, ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'name.whitelist')
  ConfigNodePropertyString? get namePeriodWhitelist;

  @BuiltValueField(wireName: r'allow.expressions')
  ConfigNodePropertyBoolean? get allowPeriodExpressions;

  ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties._();

  factory ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties([void updates(ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder b)]) = _$ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties> get serializer => _$ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesSerializer();
}

class _$ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties, _$ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties];

  @override
  final String wireName = r'ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.namePeriodWhitelist != null) {
      yield r'name.whitelist';
      yield serializers.serialize(
        object.namePeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.allowPeriodExpressions != null) {
      yield r'allow.expressions';
      yield serializers.serialize(
        object.allowPeriodExpressions,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.namePeriodWhitelist.replace(valueDes);
          break;
        case r'allow.expressions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.allowPeriodExpressions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder();
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

