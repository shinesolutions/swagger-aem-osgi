//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties.g.dart';

/// ComDayCqDamInddImplServletSnippetCreationServletProperties
///
/// Properties:
/// * [snippetcreationPeriodMaxcollections] 
@BuiltValue()
abstract class ComDayCqDamInddImplServletSnippetCreationServletProperties implements Built<ComDayCqDamInddImplServletSnippetCreationServletProperties, ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'snippetcreation.maxcollections')
  ConfigNodePropertyInteger? get snippetcreationPeriodMaxcollections;

  ComDayCqDamInddImplServletSnippetCreationServletProperties._();

  factory ComDayCqDamInddImplServletSnippetCreationServletProperties([void updates(ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder b)]) = _$ComDayCqDamInddImplServletSnippetCreationServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamInddImplServletSnippetCreationServletProperties> get serializer => _$ComDayCqDamInddImplServletSnippetCreationServletPropertiesSerializer();
}

class _$ComDayCqDamInddImplServletSnippetCreationServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamInddImplServletSnippetCreationServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamInddImplServletSnippetCreationServletProperties, _$ComDayCqDamInddImplServletSnippetCreationServletProperties];

  @override
  final String wireName = r'ComDayCqDamInddImplServletSnippetCreationServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamInddImplServletSnippetCreationServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.snippetcreationPeriodMaxcollections != null) {
      yield r'snippetcreation.maxcollections';
      yield serializers.serialize(
        object.snippetcreationPeriodMaxcollections,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamInddImplServletSnippetCreationServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'snippetcreation.maxcollections':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.snippetcreationPeriodMaxcollections.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamInddImplServletSnippetCreationServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder();
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

