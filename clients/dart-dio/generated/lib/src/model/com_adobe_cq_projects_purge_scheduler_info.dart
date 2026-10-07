//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_cq_projects_purge_scheduler_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_projects_purge_scheduler_info.g.dart';

/// ComAdobeCqProjectsPurgeSchedulerInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComAdobeCqProjectsPurgeSchedulerInfo implements Built<ComAdobeCqProjectsPurgeSchedulerInfo, ComAdobeCqProjectsPurgeSchedulerInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeCqProjectsPurgeSchedulerProperties? get properties;

  ComAdobeCqProjectsPurgeSchedulerInfo._();

  factory ComAdobeCqProjectsPurgeSchedulerInfo([void updates(ComAdobeCqProjectsPurgeSchedulerInfoBuilder b)]) = _$ComAdobeCqProjectsPurgeSchedulerInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqProjectsPurgeSchedulerInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqProjectsPurgeSchedulerInfo> get serializer => _$ComAdobeCqProjectsPurgeSchedulerInfoSerializer();
}

class _$ComAdobeCqProjectsPurgeSchedulerInfoSerializer implements PrimitiveSerializer<ComAdobeCqProjectsPurgeSchedulerInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeCqProjectsPurgeSchedulerInfo, _$ComAdobeCqProjectsPurgeSchedulerInfo];

  @override
  final String wireName = r'ComAdobeCqProjectsPurgeSchedulerInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqProjectsPurgeSchedulerInfo object, {
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
        specifiedType: const FullType(ComAdobeCqProjectsPurgeSchedulerProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqProjectsPurgeSchedulerInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqProjectsPurgeSchedulerInfoBuilder result,
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
            specifiedType: const FullType.nullable(ComAdobeCqProjectsPurgeSchedulerProperties),
          ) as ComAdobeCqProjectsPurgeSchedulerProperties?;
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
  ComAdobeCqProjectsPurgeSchedulerInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqProjectsPurgeSchedulerInfoBuilder();
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

