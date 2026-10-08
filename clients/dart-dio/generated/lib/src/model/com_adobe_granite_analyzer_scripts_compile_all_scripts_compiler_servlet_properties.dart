//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties.g.dart';

/// ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties
///
/// Properties:
/// * [disabled] 
@BuiltValue()
abstract class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties implements Built<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties, ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'disabled')
  ConfigNodePropertyBoolean? get disabled;

  ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties._();

  factory ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties([void updates(ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder b)]) = _$ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties> get serializer => _$ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesSerializer();
}

class _$ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties, _$ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties];

  @override
  final String wireName = r'ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties object, {
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
    ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder result,
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
  ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder();
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

