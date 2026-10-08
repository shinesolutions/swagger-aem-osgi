//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_aem_transaction_core_impl_transaction_recorder_properties.g.dart';

/// ComAdobeAemTransactionCoreImplTransactionRecorderProperties
///
/// Properties:
/// * [isTransactionRecordingEnabled] 
@BuiltValue()
abstract class ComAdobeAemTransactionCoreImplTransactionRecorderProperties implements Built<ComAdobeAemTransactionCoreImplTransactionRecorderProperties, ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder> {
  @BuiltValueField(wireName: r'isTransactionRecordingEnabled')
  ConfigNodePropertyBoolean? get isTransactionRecordingEnabled;

  ComAdobeAemTransactionCoreImplTransactionRecorderProperties._();

  factory ComAdobeAemTransactionCoreImplTransactionRecorderProperties([void updates(ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder b)]) = _$ComAdobeAemTransactionCoreImplTransactionRecorderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeAemTransactionCoreImplTransactionRecorderProperties> get serializer => _$ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesSerializer();
}

class _$ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesSerializer implements PrimitiveSerializer<ComAdobeAemTransactionCoreImplTransactionRecorderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeAemTransactionCoreImplTransactionRecorderProperties, _$ComAdobeAemTransactionCoreImplTransactionRecorderProperties];

  @override
  final String wireName = r'ComAdobeAemTransactionCoreImplTransactionRecorderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeAemTransactionCoreImplTransactionRecorderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isTransactionRecordingEnabled != null) {
      yield r'isTransactionRecordingEnabled';
      yield serializers.serialize(
        object.isTransactionRecordingEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeAemTransactionCoreImplTransactionRecorderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'isTransactionRecordingEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.isTransactionRecordingEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeAemTransactionCoreImplTransactionRecorderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeAemTransactionCoreImplTransactionRecorderPropertiesBuilder();
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

