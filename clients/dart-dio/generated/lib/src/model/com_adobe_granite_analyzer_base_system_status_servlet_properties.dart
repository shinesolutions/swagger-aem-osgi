//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_analyzer_base_system_status_servlet_properties.g.dart';

/// ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties
///
/// Properties:
/// * [disabled] 
@BuiltValue()
abstract class ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties implements Built<ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties, ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'disabled')
  ConfigNodePropertyBoolean? get disabled;

  ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties._();

  factory ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties([void updates(ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder b)]) = _$ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties> get serializer => _$ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesSerializer();
}

class _$ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties, _$ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties];

  @override
  final String wireName = r'ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.disabled != null) {
      yield r'disabled';
      yield serializers.serialize(
        object.disabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'disabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.disabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder();
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

