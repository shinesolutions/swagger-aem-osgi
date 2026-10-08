//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'apache_sling_health_check_result_html_serializer_properties.g.dart';

/// ApacheSlingHealthCheckResultHTMLSerializerProperties
///
/// Properties:
/// * [styleString] 
@BuiltValue()
abstract class ApacheSlingHealthCheckResultHTMLSerializerProperties implements Built<ApacheSlingHealthCheckResultHTMLSerializerProperties, ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder> {
  @BuiltValueField(wireName: r'styleString')
  ConfigNodePropertyString? get styleString;

  ApacheSlingHealthCheckResultHTMLSerializerProperties._();

  factory ApacheSlingHealthCheckResultHTMLSerializerProperties([void updates(ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder b)]) = _$ApacheSlingHealthCheckResultHTMLSerializerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ApacheSlingHealthCheckResultHTMLSerializerProperties> get serializer => _$ApacheSlingHealthCheckResultHTMLSerializerPropertiesSerializer();
}

class _$ApacheSlingHealthCheckResultHTMLSerializerPropertiesSerializer implements PrimitiveSerializer<ApacheSlingHealthCheckResultHTMLSerializerProperties> {
  @override
  final Iterable<Type> types = const [ApacheSlingHealthCheckResultHTMLSerializerProperties, _$ApacheSlingHealthCheckResultHTMLSerializerProperties];

  @override
  final String wireName = r'ApacheSlingHealthCheckResultHTMLSerializerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ApacheSlingHealthCheckResultHTMLSerializerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.styleString != null) {
      yield r'styleString';
      yield serializers.serialize(
        object.styleString,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ApacheSlingHealthCheckResultHTMLSerializerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'styleString':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.styleString.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ApacheSlingHealthCheckResultHTMLSerializerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder();
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

