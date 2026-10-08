//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_info.g.dart';

/// ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo implements Built<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo, ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties? get properties;

  ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo._();

  factory ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo([void updates(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder b)]) = _$ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo> get serializer => _$ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoSerializer();
}

class _$ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoSerializer implements PrimitiveSerializer<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo, _$ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo];

  @override
  final String wireName = r'ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo object, {
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
        specifiedType: const FullType(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder result,
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
            specifiedType: const FullType.nullable(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties),
          ) as ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties?;
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
  ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder();
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

