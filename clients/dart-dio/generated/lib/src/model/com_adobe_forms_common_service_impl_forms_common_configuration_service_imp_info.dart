//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_info.g.dart';

/// ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo implements Built<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo, ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties? get properties;

  ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo._();

  factory ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo([void updates(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder b)]) = _$ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo> get serializer => _$ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoSerializer();
}

class _$ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoSerializer implements PrimitiveSerializer<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo, _$ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo];

  @override
  final String wireName = r'ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties),
          ) as ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder();
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

