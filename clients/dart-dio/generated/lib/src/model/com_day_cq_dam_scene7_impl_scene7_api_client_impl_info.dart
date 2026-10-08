//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_scene7_impl_scene7_api_client_impl_info.g.dart';

/// ComDayCqDamScene7ImplScene7APIClientImplInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComDayCqDamScene7ImplScene7APIClientImplInfo implements Built<ComDayCqDamScene7ImplScene7APIClientImplInfo, ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComDayCqDamScene7ImplScene7APIClientImplProperties? get properties;

  ComDayCqDamScene7ImplScene7APIClientImplInfo._();

  factory ComDayCqDamScene7ImplScene7APIClientImplInfo([void updates(ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder b)]) = _$ComDayCqDamScene7ImplScene7APIClientImplInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamScene7ImplScene7APIClientImplInfo> get serializer => _$ComDayCqDamScene7ImplScene7APIClientImplInfoSerializer();
}

class _$ComDayCqDamScene7ImplScene7APIClientImplInfoSerializer implements PrimitiveSerializer<ComDayCqDamScene7ImplScene7APIClientImplInfo> {
  @override
  final Iterable<Type> types = const [ComDayCqDamScene7ImplScene7APIClientImplInfo, _$ComDayCqDamScene7ImplScene7APIClientImplInfo];

  @override
  final String wireName = r'ComDayCqDamScene7ImplScene7APIClientImplInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7APIClientImplInfo object, {
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
        specifiedType: const FullType(ComDayCqDamScene7ImplScene7APIClientImplProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7APIClientImplInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder result,
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
            specifiedType: const FullType.nullable(ComDayCqDamScene7ImplScene7APIClientImplProperties),
          ) as ComDayCqDamScene7ImplScene7APIClientImplProperties?;
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
  ComDayCqDamScene7ImplScene7APIClientImplInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder();
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

